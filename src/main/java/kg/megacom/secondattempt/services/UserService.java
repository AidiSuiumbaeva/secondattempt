package kg.megacom.secondattempt.services;

import kg.megacom.secondattempt.models.User;
import kg.megacom.secondattempt.models.dto.UserDto;

import java.util.Arrays;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    UserDto find(Long id);
    int findMax(int[] nums);

}
