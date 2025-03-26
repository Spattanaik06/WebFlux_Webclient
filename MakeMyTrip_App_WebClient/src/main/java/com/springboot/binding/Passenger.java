package com.springboot.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//{
//email	[...]
//phoneNo	[...]
//doj	[...]
//startPoint	[...]
//endPoint	[...]
//trainNumber	[...]
//name	[...]
//}

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger 
{
 private String name;
 private String email;
 private String phoneNo;
 private String doj;
 private String startPoint;
 private String endPoint;
 private Integer trainNumber;
}
