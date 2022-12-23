package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}

/*
Настройте запуск приложения на свободный порт, выберите дефолтный Tomcat, измените адрес,
который будет вызван после запуска, на /, так как в нашем приложении для этой страницы есть контроллер.
Далее следует настроить артефакт. Нажмите кнопку Fix, далее «+», выберите артефакт с именем “название проекта”-war exploded.
После этого подтвердите изменения и запускайте приложение.
Ваш браузер откроется автоматически и вы увидите страницу приветствия.

Отдельное внимание стоит уделить тому, что в приложении нет метода main, его запуск происходит из-под Tomcat
и для этого требуется отдельный класс AppInit, который ссылается на корневой конфигурационный файл и обозначает,
на каком url будет находиться наше приложение.

Задание:
1. Создайте еще один контроллер, замаппленный на /cars. SUCCESS
2. Создайте модель Car с тремя произвольными полями.    SUCCESS
3. Создайте список из 5 машин.                          SUCCESS
4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
5. Создайте страницу cars.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
6. При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.
 */