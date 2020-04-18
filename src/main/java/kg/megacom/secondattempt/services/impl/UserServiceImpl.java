package kg.megacom.secondattempt.services.impl;

import kg.megacom.secondattempt.mapper.ClassMapper;
import kg.megacom.secondattempt.models.User;
import kg.megacom.secondattempt.models.dto.UserDto;
import kg.megacom.secondattempt.repositories.UserRep;
import kg.megacom.secondattempt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
 private UserRep userRep;
    @Override
    public UserDto saveUser(UserDto userDto) {
        User user=ClassMapper.INSTANCE.userDtoToUser(userDto);
       user= userRep.save(user);
    userDto=ClassMapper.INSTANCE.userToUserDto(user);
return userDto;
    }

    @Override
    public UserDto find(Long id) {
        return ClassMapper.INSTANCE.userToUserDto(userRep.findById(id).orElse(null));
    }

    @Override
    public int findMax(int[] nums) {

        return Arrays.stream(nums)
                .max().getAsInt();
    }
}
