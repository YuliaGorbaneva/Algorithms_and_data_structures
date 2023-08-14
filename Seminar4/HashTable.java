package Seminar4;

public class HashTable<K, V> {

    private static final double LOAD_SIZE = 0.75;

    private int size;

    private List<K, V>[] lists;

    public HashTable() {
        this(4);
    }

    public HashTable(int _size) {
        if (_size < 4) {
            lists = new List[4];
        } else {
            lists = new List[_size];
        }
        size = 0;
    }

    private int calculateIndex(K key) {
        return Math.abs(key.hashCode() % lists.length);
    }

    public boolean add(K key, V value) {
        if (lists.length * LOAD_SIZE < size) {
            resize();
        }
        int index = calculateIndex(key);
        List<K, V> list = lists[index];
        if (list == null) {
            list = new List<>();
            lists[index] = list;
        }
        boolean added = list.add(key, value);
        if (added) {
            size++;
        }
        return added;
    }

    public boolean remove(K key) {
        int index = calculateIndex(key);
        List<K, V> list = lists[index];
        if (list == null) {
            return false;
        }
        boolean removed = list.remove(key);
        if (removed) {
            size--;
        }
        return removed;
    }

    private void resize() {
        List<K, V>[] old = lists;
        lists = new List[(int) (old.length + 1.5)];
        for (int i = 0; i < old.length; i++) {
            List<K, V> list = old[i];
            if (list == null) {
                continue;
            }
            List.Node curretNode = list.root;
            while (curretNode != null) {
                this.add((K) curretNode.entity.key, (V) curretNode.entity.value);
                curretNode = curretNode.next;
            }
            old[i] = null;
        }
        old = null;
    }

    public int getSize() {
        return size;
    }

    public int getLenght() {
        return lists.length;
    }

    public V getValue(K key) {
        int index = calculateIndex(key);
        List<K, V> list = lists[index];
        return list.getValue(key);
    }

    public void print() {
        for (var item : lists) {
            if (item != null) {
                item.print();
                System.out.println();
            } else {
                System.out.println("--");
            }
        }
    }

    private class List<K, V> {
        Node root;

        private boolean add(Entity entity) {
            Node newNode = new Node();
            newNode.entity = entity;
            if (root == null) {
                root = newNode;
                return true;
            }
            Node curretNode = root;
            while (curretNode != null) {
                if (curretNode.entity.key.equals(entity.key)) {
                    return false;
                }
                if (curretNode.next == null) {
                    curretNode = newNode;
                    return true;
                }
                curretNode = curretNode.next;
            }
            return false;
        }

        public boolean add(K key, V value) {
            Entity entity = new Entity(key, value);
            return this.add(entity);
        }

        public boolean remove(K key) {
            if (root == null) {
                return false;
            }
            if (root.entity.key == key) {
                root = root.next;
                return true;
            }
            Node curretNode = root;
            while (curretNode.next != null) {
                if (curretNode.next.entity.key.equals(key)) {
                    curretNode.next = curretNode.next.next;
                    return true;
                }
                curretNode = curretNode.next;
            }
            return false;
        }

        public V getValue(K key) {
            Node curretNode = root;
            while (curretNode != null) {
                if (curretNode.entity.key.equals(key)) {
                    return curretNode.entity.value;
                }
                curretNode = curretNode.next;
            }
            return null;
        }

        public boolean setValue(K key, V value) {
            Node curretNode = root;
            while (curretNode != null) {
                if (curretNode.entity.key.equals(key)) {
                    curretNode.entity.value = value;
                    return true;
                }
                curretNode = curretNode.next;
            }
            return false;
        }

        public void print() {
            Node curretNode = root;
            while (curretNode != null) {
                System.out.println("[" + curretNode.entity.key + ";" + curretNode.entity.value + "]");
                curretNode = curretNode.next;
            }
        }

        private class Node {
            Entity entity;
            Node next;
        }

        private class Entity {
            K key;
            V value;

            Entity() {
            }

            Entity(K _key, V _value) {
                this.key = _key;
                this.value = _value;
            }
        }
    }

}
