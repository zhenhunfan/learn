using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace _03_Exception.Controllers
{
    [ApiController]
    [Route("api/Error")]
    public class ErrorController:ControllerBase
    {
        [HttpGet]
        public IActionResult GetError()
        {
            throw new Exception("hello");
        }
    }
}
