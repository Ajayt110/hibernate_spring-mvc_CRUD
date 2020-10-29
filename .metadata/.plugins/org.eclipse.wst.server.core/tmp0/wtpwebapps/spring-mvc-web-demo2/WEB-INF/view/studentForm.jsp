<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>  
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<sp:form action="displayDetails" modelAttribute="student">
	Student First Name: <sp:input path="firstName"/>
	<br><br>
	Student Second Name: <sp:input path="lastName"/>
	<br><br>
	Select Country: <sp:select path="country">
							<sp:option value="India" label=""/>
							<sp:option value="Brazil" label="Brazil"/>
							<sp:option value="USA" label="USA"/>
							<sp:option value="UK" label="UK"/>
							<sp:option value="Japan" label="Japan"/>
							<sp:option value="China" label="China"/>
					</sp:select>
	<br><br>
	Favourite Anime:  <br>Naruto Shippuden <sp:radiobutton path="anime" value ="Naruto Shippuden"/>	
						Bleach <sp:radiobutton path="anime" value ="Bleach"/>		
						Steins' Gate <sp:radiobutton path="anime" value ="Steins' Gate"/>		
						Fullmetal Alchemist <sp:radiobutton path="anime" value ="Fullmetal Alchemist"/>			
	<br><br>
	Preferred Genre of Anime: <br> Action <sp:checkbox value="Action" path="animeGenre"/>
	Comedy <sp:checkbox value="Comedy" path="animeGenre"/>
	Adventure <sp:checkbox value="Adventure" path="animeGenre"/>
	Drama <sp:checkbox value="Drama" path="animeGenre"/>
	Psycological <sp:checkbox value="Psycological" path="animeGenre"/>
	Slice of life <sp:checkbox value="Slice of life" path="animeGenre"/>
	Music <sp:checkbox value="Music" path="animeGenre"/>
		
		<br><br>
	
	<input type="submit" value="Submit">
</sp:form>
</body>
</html>