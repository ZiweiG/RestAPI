# RestAPI
I used three .java files to create restAPI. RestAPIInit would run and initialize a test.db database, then a test table, in sqlite db, in actul scenerio would take in command line arguement as parameter for the .db file name (similar case for other two file; hardcoded for test purpose). The InstertApp.java I implemented functions to insert data into the table created, and the DeleteApp.java has methods to remove a table (which in this case is delete a menu section).


Here are the instructions on how to run it:
Firstly, compile the three program and run. 
1)	To get a menu section by id
    After running the program, using the following SELECT statement in SQlite:
    SELECT DISTINCT
     id
    FROM
     table; //(generic table name)
2)	Get all menu sections
    After running the program, using the following SELECT statement in SQlite:
    SELECT
     id,
     name
    FROM
     warehouses; //(or assigned table name)
3)	Add a new menu section
    Use InsertApp function to initialize
4)	Edit a menu section 
    After running the program, using the following SELECT statement in SQlite:
    INSERT INTO name
    VALUES
      ('Salad');
5)	Delete a menu section
    Run the deleteApp program with the id of the section



