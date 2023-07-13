// Структуры данных
// Структурами данных называеют некоторый контейнер с данными,обладающий спецефическим внутренним устройством (макетом) и логикой храненияю
// Различные макеты могут быть эффективны для некоторых операций и неэффективны для других.
// Массив - это контейнер, хранящий данные идентифицируемыепо индексу.
//      К любому элементу массива всегда можно обратиться по его индексу и достать или заменить его.
// Особенностью массива является то, что доступ к элементам по индексу осуществляется за константное время, т.е. имеет сложность O(1)
// Основные операции с массивами
//  - простые алгоритмы сортировки
//  - алгоритмы поиска
//  - продвинутые алгоритмы сортировки
// Просты алгоритмы сравнения - O(n^2)
// 1. Пузырьковя сортировка
// 2. Сортировка выбором
// 3. Сортировка вставками

// Пузырьковая сортировка
// void BubbleSort(int [] array)
// {
//     int temp = 0;
//     bool finish = true;
//     do
//     {
//         finish = true;
//         for (int i = 0; i < array.Length - 1; i++)
//         {
//             if (array[i] > array[i + 1])
//             {
//                 temp = array[i];
//                 array[i] = array[i + 1];
//                 array[i + 1] = temp;
//                 finish = false;
//             }
//         }
//     } while (!finish);
//     for (int i = 0; i < array.Length; i++)
//     {
//         Console.Write($"{array[i]} ");
//     }    
// }
// int [] array = new int [] {4, 2, 5, 8, 1, 9, 2, 3, 6, 7};
// BubbleSort(array);

// Сортировка выбором
// void DirectSort(int [] array)
// {
//     for (int i = 0; i < array.Length - 1; i++)
//     {
//         int minPOsition = i;
//         for (int j = i + 1; j < array.Length; j++)
//         {
//             if(array[j] < array[minPOsition])
//             {
//                 minPOsition = j;
//             }
//         }
//         if (i != minPOsition)
//         {
//             int temp = array[i];
//             array[i] = array[minPOsition];
//             array[minPOsition] = temp;
//         }
//     }
//     for (int i = 0; i < array.Length; i++)
//     {
//         Console.Write($"{array[i]} ");
//     }    
// }
// int [] array = new int [] {4, 2, 5, 8, 1, 9, 2, 3, 6, 7};
// DirectSort(array);

// Сортировка вставками
// void InsertSort(int [] array)
// {
//     for (int i = 0; i < array.Length - 1; i++)
//     {
//         for (int j = i + 1; j < array.Length; j++)
//         {
//             if(array[i] > array[j])
//             {
//                  int temp = array[i];
//                  array[i] = array[j];
//                  array[j] = temp;
//             }
//         }
//     }
//     for (int i = 0; i < array.Length; i++)
//     {
//         Console.Write($"{array[i]} ");
//     }    
// }
// int [] array = new int [] {5,6,8,2,5,9,3,8,5,7,2,1};
// InsertSort(array);


// Алгоритмы поиска
// 1. Простой перебор
// 2. Бинарный поиск

// Простой перебор
// int Find(int [] array, int value)
// {
//     for (int i = 0; i < array.Length; i++)
//     {
//         if (array[i] == value)
//         {
//             return i;
//         }
//     }
//     return -1;
// }
// int [] array = new int []{4,6,4,9,2,9,2,8,3,8,6,3};
// int value = 3;
// Find(array, value);
// Console.Write(array);


// Бинарный поиск(разделяй и властвуй)
// int BinarySort(int [] array, int value, int min, int max)
// {
//     int midPoint; 
//     if (max < min)
//     {
//         return -1;
//     }
//     else 
//     {
//         midPoint = (max - min) / 2 + min;
//     }
//     if (array[midPoint] < value)
//     {
//         return BinarySort(array, value, (min = midPoint + 1), max);
//     }
//     else
//     {
//         if(array[midPoint] > value)
//         {
//             return BinarySort(array, value, min, (max = midPoint - 1));
//         }
//         else
//         {
//             return midPoint;
//         }
//     }
// }
// int [] array = new int []{1,2,3,4,5,6,7,8,9};
// int value = 9;
// int min = 0;
// int max = 9;
// BinarySort(array, value, min, max);
// Console.WriteLine(array);


// Продвинутые алгоритмы сортировки
// 1. Быстрая сортировка - парадигма разработки алгоритмов, заключающаяяся в рекурсивном разбиении решаемой задачина две и более подзадачи, но меньшего размера, и комбинировании их решений для получения ответа к исходной задаче; разбивание задачи до тех пор, пока все подзадачи не окажутся элементарными.
// Пивот (от анг. pivot - поворот) - элемент,служащий точкой сравнения элементов и их "поворота", в случае необходимости
// 2. Пирамидальная сортировка

// Быстрая сортировка
