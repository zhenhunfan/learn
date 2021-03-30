using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.SignalR;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace HelloSignalR.Controllers
{
    [Route("api/count")]
    public class CountController:Controller
    {
        private readonly IHubContext<CountHub> counthub;

        public CountController(IHubContext<CountHub> counthub)
        {
            this.counthub = counthub;
        }

        [HttpPost]
        public async Task<IActionResult> Post()
        {
            await counthub.Clients.All.SendAsync("someFunc", new { random = "abcd" });  //调用客户端的方法someFunc，传递参数

            return Accepted(1);
        }

        
    }
}
