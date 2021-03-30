using EFCore.Data;
using EFCore.DomainModels;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace EFCore.Web.Controller
{
    [ApiController]
    [Route("api/[controller]")]
    public class DemoController:ControllerBase
    {
        private readonly MyContext myContext;

        public DemoController(MyContext myContext)
        {
            this.myContext = myContext;
        }

        [HttpPost("province")]
        public IActionResult InsertNewProvince()
        {
            Province province = new Province
            {
                Name = "浙江省",
                Population = 10_000_000
            };

            myContext.Provinces.Add(province);  //并没有执行到数据库，myContext开始追踪province对象

            myContext.SaveChanges(); //执行到数据库

            return Ok(province);
        }

        [HttpGet("provinces")]
        public IActionResult GetAllProvice()
        {
            var list = myContext.Provinces.ToList();
            return Ok(list);
        }

        [HttpGet("provincesAndcities")]
        public IActionResult GetAllProvinceAndCities()
        {
            var list = myContext.Provinces.Include(x=>x.Cities).ToList(); //预加载
            //var list2 = myContext.Provinces.Select(x => new { x.Name, x.Population }).ToList(); //映射加载
            //var list3 = myContext.Provinces.Select(x => new { x.Name, x.Population,Cities = x.Cities.Where(y=>y.Name=="沈阳").ToList() }).ToList(); //映射加载
            //var list4 = myContext.Provinces.Where(x => x.Cities.Any(y => y.Name == "沈阳")).ToList();
            return Ok(list);
        }

        [HttpPut("province")]
        public IActionResult UpDateProvince()
        {
            var province = myContext.Provinces.OrderBy(x => x.Id).First();
            if (province != null)
            {
                province.Name = "上海";
                myContext.SaveChanges();
            }
            return Ok(province);
        }

        
    }
}
