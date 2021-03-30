using System;
using System.Collections.Generic;
using System.Threading;
using System.Threading.Tasks;

namespace 多线程安全演示2
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> list = new List<int>();
            for (int i = 0; i < 10000; i++) {
                Task.Run(() => {
                    list.Add(i);
                });
            }
            Thread.Sleep(5000);
            Console.WriteLine($"list集合长度{list.Count}");
        }
    }
}
