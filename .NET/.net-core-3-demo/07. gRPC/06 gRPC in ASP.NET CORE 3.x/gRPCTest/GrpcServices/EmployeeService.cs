using Grpc.Core;
using GRpc_Api;
using gRPCTest.Repositories;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using static GRpc_Api.Employees;

namespace gRPCApi.GrpcServices
{
    public class EmployeeService : EmployeesBase
    {
        private readonly IEmployeeRepository _employeeRepository;

        public EmployeeService(IEmployeeRepository employeeRepository)
        {
            _employeeRepository = employeeRepository;
        }

        public override Task<GetAllResponse> GetAll(GetAllRequest request, ServerCallContext context)
        {
            var result = new GetAllResponse();

            result.Employees.AddRange(_employeeRepository.GetAll());
            return Task.FromResult(result);
        }
    }
}
