Main();

void Main ()
{
    Console.WriteLine("Wirte lenght massiv: ");
    int n = int.Parse(Console.ReadLine()); 
    int [] array = new int [n];
    PrintArray(array);
    FillArray(array);
    PiramidSorting(array);
    Console.WriteLine();
    PrintArray(array);

}
void FillArray(int [] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        Console.Write(array[i] + " ");
    }
}

void PrintArray(int [] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(1,10);
    }
}

void HeapNumbers(int [] array, int m, int i)
{
    int max = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    if (left < m && array[left] > array[max])
    {
        max = left;
    }
    if (right < m && array[left] > array[max])
    {
        max = right;
    }
    if (max != i)
    {
        int temp = array[i];
        array[i] = array[max];
        array[max] = temp;
    }
}

void PiramidSorting(int [] array)
{
    for (int i = array.Length / 2 - 1; i >= 0; i--)
    {
        HeapNumbers(array, array.Length, i);           
    }
    for (int i = array.Length - 1; i >= 0; i--)
    {
        int temp = array[0];
        array[0] = array[i];
        array[i] = temp;
        HeapNumbers(array, i, 0);
    }
}
