package com.crio.qeats.exchanges;

import com.crio.qeats.dto.Restaurant;
import lombok.*;

import javax.validation.Valid;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PostRestaurantRequest {
    public @Valid Restaurant restaurant;
}
