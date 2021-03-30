using System;
using System.Threading;

namespace async和await演示1
{
    class Program
    {
        static void Main(string[] args)
        {
            new AsyncAndAwaitDemo().Show();

            Thread.Sleep(2000);
        }
    }
}
