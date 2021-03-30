using HelloSignalR.Services;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.SignalR;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace HelloSignalR
{
    //[Authorize]
    public class CountHub : Hub
    {
        private readonly CountService countService;

        public CountHub(CountService countService)
        {
            this.countService = countService;
        }

        public async Task GetLatestCount(string random)
        {
            //var username = Context.User.Identity.Name;    //获取用户名
            int count;
            do
            {
                count = countService.GetLatestCount();

                Thread.Sleep(1000);

                await Clients.All.SendAsync("ReceiveUpdate", count);

            } while (count < 10);

            await Clients.All.SendAsync("Finished");
        }

        public override async Task OnConnectedAsync()
        {
            //string ConnectionId = Context.ConnectionId;
            //var client = Clients.Client(ConnectionId);

            //await client.SendAsync("someFunc", new { }); //调用指定客户端的someFunc方法
            //await Clients.AllExcept(ConnectionId).SendAsync("someFunc", new { }); //调用除了指定的客户端外的客户端的someFunc方法


            //await Groups.AddToGroupAsync(ConnectionId, "MyGroup");    //给客户端分组到MyGroup组里，相当于加群
            //await Groups.RemoveFromGroupAsync(ConnectionId, "MyGroup");   //将指定客户端从MyGroup组里删除，相当于退群

            //await Clients.Groups("MyGroup").SendAsync("someFunc", new { });   //向指定组内的客户端调用方法someFunc,相当于群聊
        }
    }
}
