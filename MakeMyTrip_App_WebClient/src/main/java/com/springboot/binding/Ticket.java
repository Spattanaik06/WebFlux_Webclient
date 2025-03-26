package com.springboot.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//{
//ticketNumber	[...]
//phoneNo	[...]
//email	[...]
//doj	[...]
//startPoint	[...]
//endPoint	[...]
//trainNumber	[...]
//name	[...]
//trainStatus	[...]
//}

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket 
{
	private Integer ticketNumber;
	 private String name;
	 private String email;
	 private String phoneNo;
	 private String doj;
	 private String startPoint;
	 private String endPoint;
	 private Integer trainNumber;
	 private String trainStatus;
}
