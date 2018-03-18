/*-
 *  File    :   MyController.java
 *  Version :   1.0
 *  Date    :   Mar 18, 2018
 *  Author  :   raviraj
 *
    This file is part of 002-spring-boot-jsp.

    002-spring-boot-jsp is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    002-spring-boot-jsp is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with 002-spring-boot-jsp.  If not, see <http://www.gnu.org/licenses/>.

 */
package com.raviraj.sample.web;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author raviraj
 * @date   Mar 18, 2018
 * @since  1.0
 */
@Controller
public class MyTestController {

	@RequestMapping("/itWorks")
	@ResponseBody
	public String helloWorld() {
		return "Hello World !!! Testing web project set up at " + LocalDateTime.now();
	}
}
