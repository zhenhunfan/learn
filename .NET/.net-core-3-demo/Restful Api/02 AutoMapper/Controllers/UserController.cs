using AutoMapper;
using Microsoft.AspNetCore.Mvc;

namespace _02_AutoMapper.Controllers
{
    [ApiController]
    [Route(template:"api/[Controller]")]
    public class UserController : ControllerBase
    {
        private readonly IMapper mapper;

        public UserController(IMapper mapper)
        {
            this.mapper = mapper;
        }

        [HttpGet]
        public IActionResult GetUser()
        {
            var EntityUser = new Entities.User
            {
                Name = "张三",
                FirstName = "Micro",
                LastName = "Jackson"
            };

            var DtoUser = mapper.Map<Dto.User>(EntityUser);
            return Ok(DtoUser);
        }
    }
}
