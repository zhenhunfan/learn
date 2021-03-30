using System.Collections.Generic;

namespace EFCore.DomainModels
{
    public class Province
    {
        public Province()
        {
            Cities = new List<City>();
        }

        public int Id { get; set; }
        public string Name { get; set; }
        public int Population { get; set; }
        /// <summary>
        /// 导航属性，表里没有该字段
        /// </summary>
        public List<City> Cities { get; set; }
    }
}
