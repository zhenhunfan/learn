﻿using System;
using System.Collections.Generic;
using System.Text;

namespace EFCore.DomainModels
{
    public class Mayor
    {
        public int Id { get; set; }
        public int CityId { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public DateTime BirthDate { get; set; }
        public Gender Gender { get; set; }
        public City City { get; set; }

    }
}
