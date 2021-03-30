using EFCore.DomainModels;
using Microsoft.EntityFrameworkCore;

namespace EFCore.Data
{
    /// <summary>
    /// 包含所有与数据库交互的操作
    /// </summary>
    public class MyContext:DbContext
    {

        public MyContext(DbContextOptions<MyContext> options):base(options)
        {

        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            //指定联合主键
            modelBuilder.Entity<CityCompany>().HasKey(x => new { x.CityId, x.CompanyId });

            //下面这一堆其实可以不用写
            //指定省份和城市的1对多关系
            modelBuilder.Entity<City>()
                .HasOne(x => x.Province).WithMany(x => x.Cities).HasForeignKey(x => x.ProvinceId);

            //指定城市和公司的多对多关系
            modelBuilder.Entity<CityCompany>()
                .HasOne(x => x.City).WithMany(x => x.CityCompanies).HasForeignKey(x => x.CityId);

            modelBuilder.Entity<CityCompany>()
                .HasOne(x => x.Company).WithMany(x => x.CityCompanies).HasForeignKey(x => x.CompanyId);

            //指定城市和市长的1对1关系
            modelBuilder.Entity<Mayor>()
                .HasOne(x => x.City).WithOne(x => x.Mayor).HasForeignKey<Mayor>(x => x.CityId);

            //添加种子数据
            modelBuilder.Entity<Province>()
                .HasData(new Province
                {
                    Id=1,
                    Name="浙江省",
                    Population=50000000
                });
        }

        /// <summary>
        /// DbSet属性把Model和数据库表映射起来
        /// </summary>
        public DbSet<Province> Provinces { get; set; }
        public DbSet<City> Cities { get; set; }
        public DbSet<CityCompany> CityCompanies { get; set; }
        public DbSet<Company> Companies { get; set; }
        public DbSet<Mayor> Mayors { get; set; }


        ///// <summary>
        ///// 第一次实例化MyContext的时候，会触发OnConfiguring
        ///// </summary>
        ///// <param name="optionsBuilder"></param>
        //protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        //{
        //    //连接字符串一般不写在这儿，这儿只是Demo使用
        //    optionsBuilder.UseMySql("User ID=root;Password=123456;Host=localhost;Port=3306;Database=EFCoreDemo;"); 
        //}
    }
}
