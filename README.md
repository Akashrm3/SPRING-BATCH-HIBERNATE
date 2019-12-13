create table EXAM_RESULT (
   id INT NOT NULL auto_increment PRIMARY KEY,   
   student_name VARCHAR(30) NOT NULL,
   dob DATE NOT NULL,
   percentage  double NOT NULL
);


create table registration (
   id double NOT NULL auto_increment PRIMARY KEY,   
   name VARCHAR(30) NOT NULL,
   age double NOT NULL,
   email  double NOT NULL
);
