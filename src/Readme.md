Hi , I am Sumanth

Based on  the given task :  I have implemented the following task.

•	As the  inbuilt types/requirements  for the login page were not given , I have assumed every attribute  to be strings and created some dependency classes to store the attributes if required to map to the user class.

Created the Jwt authentication and upon on successful user login , the jwt token is shared as response token and for every subsequent request this token must be included as the
Authorization Token

-> Bearer “token”

•	Used  Mysql as a database and used docker to host my database and I have used some AWS environment variables , if needed we can directly run this in the AWS as well.

Created a basic custom “UserNotFound Exception “ to handle the user not found case .

•	Created the Endpoints for Login , get all users , delete, update the details
Since update parameters are not specified used a global update method body to update the required parameters.

•	Please find the endpoints below :

->Add user :  http://localhost:8080/internproject/adduser -> can be accessed by any user to  singup
-> http://localhost:8080/internproject/login -> verifies the username and password are present in the database and if present ,created the jwt token and returns it back.
-> http://localhost:8080/internproject/getallusers -> works with jwt only
-> http://localhost:8080/internproject/updateUSer/id -> works with jwt only

•	Used Dependencies: Spring boot dev tools , Data Jpa , Data JDBC , Oauth2Client , my sql connector.

•	I have created and tested this locally , hence I could provide only localhost endpoints , please let me know if it is required to deploy to access over internet.
