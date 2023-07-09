// Алгоритм - это точно определенная инструкция, последовательно применяя которую к исходным данным, можно получить решение задачи
// Часто алгоритмы можно представить в виде блок-схемы
// Алгоритм - это четкая инструкция для компьютера
// Критерии сложности аллгоритмов
// 1. Скорость работы
// 2. Объем потребляемой памяти(Оперативной и/или постоянной)

// Нахождение всех делителей числа
// Сложность алгоритма O(n)


// void FindAvailableDivider(int number)
// {
//     int [] arrey = new int [number];
//     for (int i = 1; i <= number; i++)
//     {
//         if (number % i == 0)
//         {
//             Console.WriteLine(i);
//         }   
//     }
// }
// FindAvailableDivider(12);
// 
// 


// Допустимые простые числа. Поиск только простых делителей
// Сложность алгоритма O(n^2)
// 

// void FindSimpleNumbers(int max)
// {
//     int count = 0;
//     int [] arrey = new int [max];  
//     for (int i = 1; i <= max; i++)
//     {
//         bool simple = true;
//         for (int j = 2; j < i; j++)
//         {
//             if (i % j == 0)
//             {
//                 count ++;
//                 simple = false;
//             }
//         }
//         if (simple)
//         {
//             Console.Write($"{i} ");
            
//         }
//     }
//     Console.WriteLine();
//     Console.WriteLine(count);
// }
// FindSimpleNumbers(100);


// Экспоненциальная зависимость
// Шанс выпадения определенной суммы на игральных картах

void FindSumm(int summ)
{
    int count = 0;
    int successResult = 0;
    for (int i = 0; i <= 6; i++)
    {
        for (int j = 0; j < 6; j++)
        {
            for (int k = 0; k < 6; k++)
            {
                if (i + j + k == summ)
                {
                    successResult ++;
                }
            }
            count ++;
        }
        
    }
    Console.WriteLine(count);
    Console.WriteLine();
    double res = successResult/count;
    Console.WriteLine(res);
}
    
FindSumm(15);

// Правила объеденинения сложности
// Если внутри метода1 будет вызываться метод2, то их сложности перемножаются
// O(n^3) * O(n^2) == O(n^5)
// Если методы будутвызываться последовательно, то их сложности складываются, т.е. берется максимальная их них
// O(n^3) + O(n^2) == O(n^3)

// Какая бывает сложность алгоритмов
