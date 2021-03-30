using AutoMapper;

namespace _02_AutoMapper.Profiles
{
    public class UserProfile:Profile
    {
        public UserProfile()
        {
            CreateMap<Entities.User, Dto.User>()
                .ForMember(
                dest => dest.UserName,
                opt => opt.MapFrom(source => source.Name))
                .ForMember(
                    dest=> dest.FullName,
                    opt => opt.MapFrom(source => source.FirstName + source.LastName)
                );
        }
    }
}
