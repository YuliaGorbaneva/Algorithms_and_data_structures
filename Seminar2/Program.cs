// // Сортировка вставками

int [] array = new int[10];
InitArray(array);
PrintArray(array);
Console.WriteLine();
// InserSort(array);
// PrintArray(array);

void InitArray(int [] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(0,10);
    }
}
void PrintArray(int [] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        Console.Write(array[i] + " ");
    }
}

// void InserSort(int [] array)
// {
//     for (int i = 1; i < array.Length; i++)
//     {
//         int value = array[i];
//         int left = i - 1;
//         while (left >= 0)
//         {
//             if (value < array[left])
//             {
//                 array[left + 1] = array[left];
//             }
//             else
//             {
//                 break;
//             }
//             left --;
//         }
//         if (left + 1 != i)
//             array[left + 1] = value;
//     }
// }



// // // Быстрая сортировка
// void quickSort(int [] array)
// {
//     quickSortR(array, 0, array.Length - 1);
// }

// void quickSortR(int [] array, int LeftBorder, int RightBorder)
// {
//     int LeftMarker = LeftBorder;
//     int RightMarker = RightBorder;
//     int pivot = array[(LeftMarker + RightMarker) / 2];
//     while (LeftMarker <= RightMarker)
//     {
//         while (array[LeftMarker] < pivot)
//         {
//             LeftMarker ++;
//         }
//         while (array[RightMarker] > pivot)
//         {
//             RightMarker --;
//         }
//         if (LeftMarker <= RightMarker)
//         {
//             if (LeftMarker < RightMarker)
//             {
//                 int temp = array[LeftMarker];
//                 array[LeftMarker] = array[RightMarker];
//                 array[RightMarker] = temp;
//             }
//             LeftMarker ++;
//             RightMarker --;
//         }
//     }  
//     if (LeftBorder < RightMarker)  
//         quickSortR(array, LeftBorder, RightMarker);
//     if (LeftMarker <RightBorder)
//         quickSortR(array, LeftMarker, RightBorder);
// }

// quickSort(array);
// PrintArray(array);

// int BinSerch(int [] array, int value)
// {
//     return BinSerchR(array, value, 0, array.Length - 1);
// }

// int BinSerchR(int [] array, int value, int left, int right)
// {
//     if (left > right)
//         return -1;
//     int mid = left + right / 2;
//     if (array[mid] < value)
//         BinSerchR(array,value, mid + 1, right);
//     else if (array[mid] > value)
//         return BinSerchR(array, value, left, mid - 1);
//     else
//         return mid;
// }
// BinSerch(array,6);
// PrintArray(array);

