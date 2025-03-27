package com.satna.mapper;

import com.satna.dto.OrderDto;
import com.satna.dto.OrderItemDto;
import com.satna.dto.UserDto;
import com.satna.model.Order;
import com.satna.model.OrderItem;
import com.satna.model.User;

public class UserMapper {

    public static UserDto toUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFullName(user.getFullName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

}
