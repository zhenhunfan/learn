using System;
using System.Collections.Generic;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace async和await演示1
{
    public class AsyncAndAwaitDemo
    {
        public void Show()
        {
            Console.WriteLine($"Show 方法Start，所属线程:{Thread.CurrentThread.ManagedThreadId}");

            NoReturn2();

            Console.WriteLine($"Show 方法End，所属线程:{Thread.CurrentThread.ManagedThreadId}");
        }

        #region 没有返回值的

        /// <summary>
        /// 一个普通的多线程
        /// </summary>
        public void NoReturn()
        {
            Console.WriteLine($"NoReturn 方法Start，所属线程:{Thread.CurrentThread.ManagedThreadId}");

            Task.Run(() =>
            {
                Console.WriteLine($"NoReturn 方法 Task Start，所属线程:{Thread.CurrentThread.ManagedThreadId}");

                Thread.Sleep(1000);

                Console.WriteLine($"NoReturn 方法 Task End，所属线程:{Thread.CurrentThread.ManagedThreadId}");
            });

            Console.WriteLine($"NoReturn 方法End，所属线程:{Thread.CurrentThread.ManagedThreadId}");
        }

        /// <summary>
        /// 和Noreturn()方法一样，await 修饰的不需要写return
        /// </summary>
        /// <returns></returns>
        public async Task NoReturn2()
        {
            Console.WriteLine($"NoReturn 方法Start，所属线程:{Thread.CurrentThread.ManagedThreadId}");

            //调用线程创建新线程执行内部操作
            Task task = Task.Run(() =>
            {
                Console.WriteLine($"NoReturn 方法 Task Start，所属线程:{Thread.CurrentThread.ManagedThreadId}");

                Thread.Sleep(1000);

                Console.WriteLine($"NoReturn 方法 Task End，所属线程:{Thread.CurrentThread.ManagedThreadId}");
            });
            //让调用线程回去忙自己的事情，用了await后，相当于将await后面的代码包装成一个回调
            await task;
            Console.WriteLine($"NoReturn 方法End，所属线程:{Thread.CurrentThread.ManagedThreadId}");
        }

        #endregion

        #region 带返回值的

        public long ReturnLong()
        {
            Console.WriteLine($"ReturnLong 方法Start，所属线程:{Thread.CurrentThread.ManagedThreadId}");

            long result = 0;

            Task.Run(() =>
            {
                Console.WriteLine($"ReturnLong 方法 Task Start，所属线程:{Thread.CurrentThread.ManagedThreadId}");
                for (int i = 0; i < 100000000; i++)
                {
                    result++;
                }

                Console.WriteLine($"ReturnLong 方法 Task End，所属线程:{Thread.CurrentThread.ManagedThreadId}");
            });

            Console.WriteLine($"ReturnLong 方法End，所属线程:{Thread.CurrentThread.ManagedThreadId}");

            return result;
        }

        /// <summary>
        /// 
        /// </summary>
        /// <returns></returns>
        public async Task<long> ReturnLong2()
        {
            Console.WriteLine($"ReturnLong2 方法Start，所属线程:{Thread.CurrentThread.ManagedThreadId}");

            long result = 0;

            await Task.Run(() =>
            {
                Console.WriteLine($"ReturnLong2 方法 Task Start，所属线程:{Thread.CurrentThread.ManagedThreadId}");
                
                //for (int i = 0; i < 100000000; i++)
                //{
                //    result++;
                //}

                Console.WriteLine($"ReturnLong2 方法 Task End，所属线程:{Thread.CurrentThread.ManagedThreadId}");
                //return result;
            });

            Console.WriteLine($"ReturnLong2 方法End，所属线程:{Thread.CurrentThread.ManagedThreadId}");

            return result;
        }

        #endregion
    }
}





