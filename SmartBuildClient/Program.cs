using System;

static class Program
{
    static void Main(string[] args)
    {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        string[] arrs = { "STUART", "linc", "james", "Madson", "May", "JOE", "lAMPARD" };

        //Console.WriteLine("Original Array:");
        //PrintArray(arr);

        //BubbleSort(arr);

        int found = LinearSearch(arr, 11);
        string results = LinearSearchString(arrs, "CARMENT");

        Console.WriteLine("These are your results "+ results);
        PrintArray(arrs);

        Console.ReadLine();
    }

    static void BubbleSort(int[] arr)
    {
        int n = arr.Length;
        int temp;

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // Swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void PrintArray(int[] arr)
    {
        foreach (int element in arr)
        {
            Console.Write(element + " ");
        }
        Console.WriteLine();
    }

    static void PrintArray(string[] arr)
    {
        foreach (string element in arr)
        {
            Console.Write(element + " ");
        }
        Console.WriteLine();
    }




    public static int LinearSearch(int[] arr, int SearchKey)
    {
        for (int i = 0; i < arr.Length; i++)
        {
            if(arr[i] == SearchKey)
            {
                return i;
            }
           
        }
        return -1;
                   
    }

    public static string LinearSearchString(string[] arr , string searchTerm)
    {
        for (int i = 0; i < arr.Length; i++)
        {
            if (arr[i] == searchTerm)
            {
                return "Your String has been found" + searchTerm + "at index " + i;
            }
        }

        return "String not found";
    }


   
}
