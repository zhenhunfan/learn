
using GRpc_Api;
using gRPCTest.Repositories;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace gRPCTest.Services
{
    public class EmployeeRepository : IEmployeeRepository
    {
        public IEnumerable<Employee> GetAll()
        {
            var list = new List<Employee>();
            list.Add(new Employee
            {
                Name = "张三"
            });
            list.Add(new Employee
            {
                Name = "李四"
            });

            return list;
        }
    }
}
