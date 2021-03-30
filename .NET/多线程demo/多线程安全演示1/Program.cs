using System;
using System.Threading;
using System.Threading.Tasks;

namespace 多线程安全演示1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine($"这是主线程启动了，主线程id:{Thread.CurrentThread.ManagedThreadId}");

            
            for (int i = 0; i < 5; i++)
            {
                int k = i;
                Task.Run(()=> { 
                    Console.WriteLine($"这是{i},{k}启动了，当前线程id:{Thread.CurrentThread.ManagedThreadId}");
                    Thread.Sleep(2000);
                    Console.WriteLine($"这是{i},{k}结束了，当前线程id:{Thread.CurrentThread.ManagedThreadId}");
                });
            }

            Thread.Sleep(3000);
            Console.WriteLine($"这是主线程结束了，主线程id:{Thread.CurrentThread.ManagedThreadId}");
        }
    }
}
