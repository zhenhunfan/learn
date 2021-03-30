using GRpc_Api;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


namespace gRPCTest.Repositories
{
    public interface IEmployeeRepository
    {
        IEnumerable<Employee> GetAll();
    }
}
