
import java.util.Scanner;

public class Main {
    // Konstant med tstaic final, SÅDANT SOM INTE ÄNDRAR
    static final String PROGRAM_VERSION = "1.0";
    static final int DAYS_IN_WEEK = 7;


    public static void main(String[] args) {


/*
Hash-index för "foo"
 "foo"
 102+111+111= 324
 324 % 100=24
 myArray[24]="foo"

 vad händer om "oof"???? kan lösas med linear probing eller linked lists "linky".
 */


        String[] topNames = {"Liam", "Noah", "Oliver", "Elijah", "William", "James", "Benjamin", "Lucas", "Henry", "Alexander", "Mason", "Michael", "Ethan", "Daniel", "Jacob", "Logan", "Jackson", "Levi", "Sebastian", "Mateo", "Jack", "Owen", "Theodore", "Aiden", "Samuel", "Joseph", "John", "David", "Wyatt", "Matthew", "Luke", "Asher", "Carter", "Julian", "Grayson", "Leo", "Jayden", "Gabriel", "Isaac", "Lincoln", "Anthony", "Hudson", "Dylan", "Ezra", "Thomas", "Charles", "Christopher", "Jaxon", "Maverick", "Josiah", "Isaiah", "Andrew", "Elias", "Joshua", "Nathan", "Caleb", "Ryan", "Adrian", "Miles", "Eli", "Nolan", "Christian", "Aaron", "Cameron", "Ezekiel", "Colton", "Luca", "Landon", "Hunter", "Jonathan", "Santiago", "Axel", "Easton", "Cooper", "Jeremiah", "Angel", "Roman", "Connor", "Jameson", "Robert", "Greyson", "Jordan", "Ian", "Carson", "Jaxson", "Leonardo", "Nicholas", "Dominic", "Austin", "Everett", "Brooks", "Xavier", "Kai", "Jose", "Parker", "Adam", "Jace", "Wesley", "Kayden", "Silas", "Bennett", "Declan", "Waylon", "Weston", "Evan", "Emmett", "Micah", "Ryder", "Beau", "Damian", "Brayden", "Gael", "Rowan", "Harrison", "Bryson", "Sawyer", "Amir", "Kingston", "Jason", "Giovanni", "Vincent", "Ayden", "Chase", "Myles", "Diego", "Nathaniel", "Legend", "Jonah", "River", "Tyler", "Cole", "Braxton", "George", "Milo", "Zachary", "Ashton", "Luis", "Jasper", "Kaiden", "Adriel", "Gavin", "Bentley", "Calvin", "Zion", "Juan", "Maxwell", "Max", "Ryker", "Carlos", "Emmanuel", "Jayce", "Lorenzo", "Ivan", "Jude", "August", "Kevin", "Malachi", "Elliott", "Rhett", "Archer", "Karter", "Arthur", "Luka", "Elliot", "Thiago", "Brandon", "Camden", "Justin", "Jesus", "Maddox", "King", "Theo", "Enzo", "Matteo", "Emiliano", "Dean", "Hayden", "Finn", "Brody", "Antonio", "Abel", "Alex", "Tristan", "Graham", "Zayden", "Judah", "Xander", "Miguel", "Atlas", "Messiah", "Barrett", "Tucker", "Timothy", "Alan", "Edward", "Leon", "Dawson", "Eric", "Ace", "Victor", "Abraham", "Nicolas", "Jesse", "Charlie", "Patrick", "Walker", "Joel", "Richard", "Beckett", "Blake", "Alejandro", "Avery", "Grant", "Peter", "Oscar", "Matias", "Amari", "Lukas", "Andres", "Arlo", "Colt", "Adonis", "Kyrie", "Steven", "Felix", "Preston", "Marcus", "Holden", "Emilio", "Remington", "Jeremy", "Kaleb", "Brantley", "Bryce", "Mark", "Knox", "Israel", "Phoenix", "Kobe", "Nash", "Griffin", "Caden", "Kenneth", "Kyler", "Hayes", "Jax", "Rafael", "Beckham", "Javier", "Maximus", "Simon", "Paul", "Omar", "Kaden", "Kash", "Lane", "Bryan", "Riley", "Zane", "Louis", "Aidan", "Paxton", "Maximiliano", "Karson", "Cash", "Cayden", "Emerson", "Tobias", "Ronan", "Brian", "Dallas", "Bradley", "Jorge", "Walter", "Josue", "Khalil", "Damien", "Jett", "Kairo", "Zander", "Andre", "Cohen", "Crew", "Hendrix", "Colin", "Chance", "Malakai", "Clayton", "Daxton", "Malcolm", "Lennox", "Martin", "Jaden", "Kayson", "Bodhi", "Francisco", "Cody", "Erick", "Kameron", "Atticus", "Dante", "Jensen", "Cruz", "Finley", "Brady", "Joaquin", "Anderson", "Gunner", "Muhammad", "Zayn", "Derek", "Raymond", "Kyle", "Angelo", "Reid", "Spencer", "Nico", "Jaylen", "Jake", "Prince", "Manuel", "Ali", "Gideon", "Stephen", "Ellis", "Orion", "Rylan", "Eduardo", "Mario", "Rory", "Cristian", "Odin", "Tanner", "Julius", "Callum", "Sean", "Kane", "Ricardo", "Travis", "Wade", "Warren", "Fernando", "Titus", "Leonel", "Edwin", "Cairo", "Corbin", "Dakota", "Ismael", "Colson", "Killian", "Major", "Tate", "Gianni", "Elian", "Remy", "Lawson", "Niko", "Nasir", "Kade", "Armani", "Ezequiel", "Marshall", "Hector", "Desmond", "Kason", "Garrett", "Jared", "Cyrus", "Russell", "Cesar", "Tyson", "Malik", "Donovan", "Jaxton", "Cade", "Romeo", "Nehemiah", "Sergio", "Iker", "Caiden", "Jay", "Pablo", "Devin", "Jeffrey", "Otto", "Kamari", "Ronin", "Johnny", "Clark", "Ari", "Marco", "Edgar", "Bowen", "Jaiden", "Grady", "Zayne", "Sullivan", "Jayceon", "Sterling", "Andy", "Conor", "Raiden", "Royal", "Royce", "Solomon", "Trevor", "Winston", "Emanuel", "Finnegan", "Pedro", "Luciano", "Harvey", "Franklin", "Noel", "Troy", "Princeton", "Johnathan", "Erik", "Fabian", "Oakley", "Rhys", "Porter", "Hugo", "Frank", "Damon", "Kendrick", "Mathias", "Milan", "Peyton", "Wilder", "Callan", "Gregory", "Seth", "Matthias", "Briggs", "Ibrahim", "Roberto", "Conner", "Quinn", "Kashton", "Sage", "Santino", "Kolton", "Alijah", "Dominick", "Zyaire", "Apollo", "Kylo", "Reed", "Philip", "Kian", "Shawn", "Kaison", "Leonidas", "Ayaan", "Lucca", "Memphis", "Ford", "Baylor", "Kyson", "Uriel", "Allen", "Collin", "Ruben", "Archie", "Dalton", "Esteban", "Adan", "Forrest", "Alonzo", "Isaias", "Leland", "Jase", "Dax", "Kasen", "Gage", "Kamden", "Marcos", "Jamison", "Francis", "Hank", "Alexis", "Tripp", "Frederick", "Jonas", "Stetson", "Cassius", "Izaiah", "Eden", "Maximilian", "Rocco", "Tatum", "Keegan", "Aziel", "Moses", "Bruce", "Lewis", "Braylen", "Omari", "Mack", "Augustus", "Enrique", "Armando", "Pierce", "Moises", "Asa", "Shane", "Emmitt", "Soren", "Dorian", "Keanu", "Zaiden", "Raphael", "Deacon", "Abdiel", "Kieran", "Phillip", "Ryland", "Zachariah", "Casey", "Zaire", "Albert", "Baker", "Corey", "Kylan", "Denver", "Gunnar", "Jayson", "Drew", "Callen", "Jasiah", "Drake", "Kannon", "Braylon", "Sonny", "Bo", "Moshe", "Huxley", "Quentin", "Rowen", "Santana", "Cannon", "Kenzo", "Wells", "Julio", "Nikolai", "Conrad", "Jalen", "Makai", "Benson", "Derrick", "Gerardo", "Davis", "Abram", "Mohamed", "Ronald", "Raul", "Arjun", "Dexter", "Kaysen", "Jaime", "Scott", "Lawrence", "Ariel", "Skyler", "Danny", "Roland", "Chandler", "Yusuf", "Samson", "Case", "Zain", "Roy", "Rodrigo", "Sutton", "Boone", "Saint", "Saul", "Jaziel", "Hezekiah", "Alec", "Arturo", "Jamari", "Jaxtyn", "Julien", "Koa", "Reece", "Landen", "Koda", "Darius", "Sylas", "Ares", "Kyree", "Boston", "Keith", "Taylor", "Johan", "Edison", "Sincere", "Watson", "Jerry", "Nikolas", "Quincy", "Shepherd", "Brycen", "Marvin", "Dariel", "Axton", "Donald", "Bodie", "Finnley", "Onyx", "Rayan", "Raylan", "Brixton", "Colby", "Shiloh", "Valentino", "Layton", "Trenton", "Landyn", "Alessandro", "Ahmad", "Gustavo", "Ledger", "Ridge", "Ander", "Ahmed", "Kingsley", "Issac", "Mauricio", "Tony", "Leonard", "Mohammed", "Uriah", "Duke", "Kareem", "Lucian", "Marcelo", "Aarav", "Leandro", "Reign", "Clay", "Kohen", "Dennis", "Samir", "Ermias", "Otis", "Emir", "Nixon", "Ty", "Sam", "Fletcher", "Wilson", "Dustin", "Hamza", "Bryant", "Flynn", "Lionel", "Mohammad", "Cason", "Jamir", "Aden", "Dakari", "Justice", "Dillon", "Layne", "Zaid", "Alden", "Nelson", "Devon", "Titan", "Chris", "Khari", "Zeke", "Noe", "Alberto", "Roger", "Brock", "Rex", "Quinton", "Alvin", "Cullen", "Azariah", "Harlan", "Kellan", "Lennon", "Marcel", "Keaton", "Morgan", "Ricky", "Trey", "Karsyn", "Langston", "Miller", "Chaim", "Salvador", "Amias", "Tadeo", "Curtis", "Lachlan", "Amos", "Anakin", "Krew", "Tomas", "Jefferson", "Yosef", "Bruno", "Korbin", "Augustine", "Cayson", "Mathew", "Vihaan", "Jamie", "Clyde", "Brendan", "Jagger", "Carmelo", "Harry", "Nathanael", "Mitchell", "Darren", "Ray", "Jedidiah", "Jimmy", "Lochlan", "Bellamy", "Eddie", "Rayden", "Reese", "Stanley", "Joe", "Houston", "Douglas", "Vincenzo", "Casen", "Emery", "Joziah", "Leighton", "Marcellus", "Atreus", "Aron", "Hugh", "Musa", "Tommy", "Alfredo", "Junior", "Neil", "Westley", "Banks", "Eliel", "Melvin", "Maximo", "Briar", "Colten", "Lance", "Nova", "Trace", "Axl", "Ramon", "Vicente", "Brennan", "Caspian", "Remi", "Deandre", "Legacy", "Lee", "Valentin", "Ben", "Louie", "Westin", "Wayne", "Benicio", "Grey", "Zayd", "Gatlin", "Mekhi", "Orlando", "Bjorn", "Harley", "Alonso", "Rio", "Aldo", "Byron", "Eliseo", "Ernesto", "Talon", "Thaddeus", "Brecken", "Kace", "Kellen", "Enoch", "Kiaan", "Lian", "Creed", "Rohan", "Callahan", "Jaxxon", "Ocean", "Crosby", "Dash", "Gary", "Mylo", "Ira", "Magnus", "Salem", "Abdullah", "Kye", "Tru", "Forest", "Jon", "Misael", "Madden", "Braden", "Carl", "Hassan", "Emory", "Kristian", "Alaric", "Ambrose", "Dario", "Allan", "Bode", "Boden", "Juelz", "Kristopher", "Genesis", "Idris", "Ameer", "Anders", "Darian", "Kase", "Aryan", "Dane", "Guillermo", "Elisha", "Jakobe", "Thatcher", "Eugene", "Ishaan", "Larry", "Wesson", "Yehuda", "Alvaro", "Bobby", "Bronson", "Dilan", "Kole", "Kyro", "Tristen", "Blaze", "Brayan", "Jadiel", "Kamryn", "Demetrius", "Maurice", "Arian", "Kabir", "Rocky", "Rudy", "Randy", "Rodney", "Yousef", "Felipe", "Robin", "Aydin", "Dior", "Kaiser", "Van", "Brodie", "London", "Eithan", "Stefan", "Ulises", "Camilo", "Branson", "Jakari", "Judson", "Yahir", "Zavier", "Damari", "Jakob", "Jaxx", "Bentlee", "Cain", "Niklaus", "Rey", "Zahir", "Aries", "Blaine", "Kyng", "Castiel", "Henrik", "Joey", "Khalid", "Bear", "Graysen", "Jair", "Kylen", "Darwin", "Alfred", "Ayan", "Kenji", "Zakai", "Avi", "Cory", "Fisher", "Jacoby", "Osiris", "Harlem", "Jamal", "Santos", "Wallace", "Brett", "Fox", "Leif", "Maison", "Reuben", "Adler", "Zev", "Calum", "Kelvin", "Zechariah", "Bridger", "Mccoy", "Seven", "Shepard", "Azrael", "Leroy", "Terry", "Harold", "Mac", "Mordechai", "Ahmir", "Cal", "Franco", "Trent", "Blaise", "Coen", "Dominik", "Marley", "Davion", "Jeremias", "Riggs", "Jones", "Will", "Damir", "Dangelo", "Canaan", "Dion", "Jabari", "Landry", "Salvatore", "Kody", "Hakeem", "Truett", "Gerald", "Lyric", "Gordon", "Jovanni", "Kamdyn", "Alistair", "Cillian", "Foster", "Terrance", "Murphy", "Zyair", "Cedric", "Rome", "Abner", "Colter", "Dayton", "Jad", "Xzavier", "Rene", "Vance", "Duncan", "Frankie", "Bishop", "Davian", "Everest", "Heath", "Jaxen", "Marlon", "Maxton", "Reginald", "Harris", "Jericho", "Keenan", "Korbyn", "Wes", "Eliezer", "Jeffery", "Kalel", "Kylian", "Turner", "Willie", "Rogelio", "Ephraim"};
        String[] sortedNames = {"Aarav", "Aaron", "Abdiel", "Abdullah", "Abel", "Abner", "Abraham", "Abram", "Ace", "Adam", "Adan", "Aden", "Adler", "Adonis", "Adrian", "Adriel", "Ahmad", "Ahmed", "Ahmir", "Aidan", "Aiden", "Alan", "Alaric", "Albert", "Alberto", "Alden", "Aldo", "Alec", "Alejandro", "Alessandro", "Alex", "Alexander", "Alexis", "Alfred", "Alfredo", "Ali", "Alijah", "Alistair", "Allan", "Allen", "Alonso", "Alonzo", "Alvaro", "Alvin", "Amari", "Ambrose", "Ameer", "Amias", "Amir", "Amos", "Anakin", "Ander", "Anders", "Anderson", "Andre", "Andres", "Andrew", "Andy", "Angel", "Angelo", "Anthony", "Antonio", "Apollo", "Archer", "Archie", "Ares", "Ari", "Arian", "Ariel", "Aries", "Arjun", "Arlo", "Armando", "Armani", "Aron", "Arthur", "Arturo", "Aryan", "Asa", "Asher", "Ashton", "Atlas", "Atreus", "Atticus", "August", "Augustine", "Augustus", "Austin", "Avery", "Avi", "Axel", "Axl", "Axton", "Ayaan", "Ayan", "Ayden", "Aydin", "Azariah", "Aziel", "Azrael", "Baker", "Banks", "Barrett", "Baylor", "Bear", "Beau", "Beckett", "Beckham", "Bellamy", "Ben", "Benicio", "Benjamin", "Bennett", "Benson", "Bentlee", "Bentley", "Bishop", "Bjorn", "Blaine", "Blaise", "Blake", "Blaze", "Bo", "Bobby", "Bode", "Boden", "Bodhi", "Bodie", "Boone", "Boston", "Bowen", "Braden", "Bradley", "Brady", "Brandon", "Branson", "Brantley", "Braxton", "Brayan", "Brayden", "Braylen", "Braylon", "Brecken", "Brendan", "Brennan", "Brett", "Brian", "Briar", "Bridger", "Briggs", "Brixton", "Brock", "Brodie", "Brody", "Bronson", "Brooks", "Bruce", "Bruno", "Bryan", "Bryant", "Bryce", "Brycen", "Bryson", "Byron", "Cade", "Caden", "Caiden", "Cain", "Cairo", "Cal", "Caleb", "Callahan", "Callan", "Callen", "Callum", "Calum", "Calvin", "Camden", "Cameron", "Camilo", "Canaan", "Cannon", "Carl", "Carlos", "Carmelo", "Carson", "Carter", "Case", "Casen", "Casey", "Cash", "Cason", "Caspian", "Cassius", "Castiel", "Cayden", "Cayson", "Cedric", "Cesar", "Chaim", "Chance", "Chandler", "Charles", "Charlie", "Chase", "Chris", "Christian", "Christopher", "Cillian", "Clark", "Clay", "Clayton", "Clyde", "Cody", "Coen", "Cohen", "Colby", "Cole", "Colin", "Collin", "Colson", "Colt", "Colten", "Colter", "Colton", "Conner", "Connor", "Conor", "Conrad", "Cooper", "Corbin", "Corey", "Cory", "Creed", "Crew", "Cristian", "Crosby", "Cruz", "Cullen", "Curtis", "Cyrus", "Dakari", "Dakota", "Dallas", "Dalton", "Damari", "Damian", "Damien", "Damir", "Damon", "Dane", "Dangelo", "Daniel", "Danny", "Dante", "Darian", "Dariel", "Dario", "Darius", "Darren", "Darwin", "Dash", "Davian", "David", "Davion", "Davis", "Dawson", "Dax", "Daxton", "Dayton", "Deacon", "Dean", "Deandre", "Declan", "Demetrius", "Dennis", "Denver", "Derek", "Derrick", "Desmond", "Devin", "Devon", "Dexter", "Diego", "Dilan", "Dillon", "Dion", "Dior", "Dominic", "Dominick", "Dominik", "Donald", "Donovan", "Dorian", "Douglas", "Drake", "Drew", "Duke", "Duncan", "Dustin", "Dylan", "Easton", "Eddie", "Eden", "Edgar", "Edison", "Eduardo", "Edward", "Edwin", "Eithan", "Eli", "Elian", "Elias", "Eliel", "Eliezer", "Elijah", "Eliseo", "Elisha", "Elliot", "Elliott", "Ellis", "Emanuel", "Emerson", "Emery", "Emiliano", "Emilio", "Emir", "Emmanuel", "Emmett", "Emmitt", "Emory", "Enoch", "Enrique", "Enzo", "Ephraim", "Eric", "Erick", "Erik", "Ermias", "Ernesto", "Esteban", "Ethan", "Eugene", "Evan", "Everest", "Everett", "Ezekiel", "Ezequiel", "Ezra", "Fabian", "Felipe", "Felix", "Fernando", "Finley", "Finn", "Finnegan", "Finnley", "Fisher", "Fletcher", "Flynn", "Ford", "Forest", "Forrest", "Foster", "Fox", "Francis", "Francisco", "Franco", "Frank", "Frankie", "Franklin", "Frederick", "Gabriel", "Gael", "Gage", "Garrett", "Gary", "Gatlin", "Gavin", "Genesis", "George", "Gerald", "Gerardo", "Gianni", "Gideon", "Giovanni", "Gordon", "Grady", "Graham", "Grant", "Graysen", "Grayson", "Gregory", "Grey", "Greyson", "Griffin", "Guillermo", "Gunnar", "Gunner", "Gustavo", "Hakeem", "Hamza", "Hank", "Harlan", "Harlem", "Harley", "Harold", "Harris", "Harrison", "Harry", "Harvey", "Hassan", "Hayden", "Hayes", "Heath", "Hector", "Hendrix", "Henrik", "Henry", "Hezekiah", "Holden", "Houston", "Hudson", "Hugh", "Hugo", "Hunter", "Huxley", "Ian", "Ibrahim", "Idris", "Iker", "Ira", "Isaac", "Isaiah", "Isaias", "Ishaan", "Ismael", "Israel", "Issac", "Ivan", "Izaiah", "Jabari", "Jace", "Jack", "Jackson", "Jacob", "Jacoby", "Jad", "Jaden", "Jadiel", "Jagger", "Jaiden", "Jaime", "Jair", "Jakari", "Jake", "Jakob", "Jakobe", "Jalen", "Jamal", "Jamari", "James", "Jameson", "Jamie", "Jamir", "Jamison", "Jared", "Jase", "Jasiah", "Jason", "Jasper", "Javier", "Jax", "Jaxen", "Jaxon", "Jaxson", "Jaxton", "Jaxtyn", "Jaxx", "Jaxxon", "Jay", "Jayce", "Jayceon", "Jayden", "Jaylen", "Jayson", "Jaziel", "Jedidiah", "Jefferson", "Jeffery", "Jeffrey", "Jensen", "Jeremiah", "Jeremias", "Jeremy", "Jericho", "Jerry", "Jesse", "Jesus", "Jett", "Jimmy", "Joaquin", "Joe", "Joel", "Joey", "Johan", "John", "Johnathan", "Johnny", "Jon", "Jonah", "Jonas", "Jonathan", "Jones", "Jordan", "Jorge", "Jose", "Joseph", "Joshua", "Josiah", "Josue", "Jovanni", "Joziah", "Juan", "Judah", "Jude", "Judson", "Juelz", "Julian", "Julien", "Julio", "Julius", "Junior", "Justice", "Justin", "Kabir", "Kace", "Kade", "Kaden", "Kai", "Kaiden", "Kairo", "Kaiser", "Kaison", "Kaleb", "Kalel", "Kamari", "Kamden", "Kamdyn", "Kameron", "Kamryn", "Kane", "Kannon", "Kareem", "Karson", "Karsyn", "Karter", "Kase", "Kasen", "Kash", "Kashton", "Kason", "Kayden", "Kaysen", "Kayson", "Keanu", "Keaton", "Keegan", "Keenan", "Keith", "Kellan", "Kellen", "Kelvin", "Kendrick", "Kenji", "Kenneth", "Kenzo", "Kevin", "Khalid", "Khalil", "Khari", "Kiaan", "Kian", "Kieran", "Killian", "King", "Kingsley", "Kingston", "Knox", "Koa", "Kobe", "Koda", "Kody", "Kohen", "Kole", "Kolton", "Korbin", "Korbyn", "Krew", "Kristian", "Kristopher", "Kye", "Kylan", "Kyle", "Kylen", "Kyler", "Kylian", "Kylo", "Kyng", "Kyree", "Kyrie", "Kyro", "Kyson", "Lachlan", "Lance", "Landen", "Landon", "Landry", "Landyn", "Lane", "Langston", "Larry", "Lawrence", "Lawson", "Layne", "Layton", "Leandro", "Ledger", "Lee", "Legacy", "Legend", "Leif", "Leighton", "Leland", "Lennon", "Lennox", "Leo", "Leon", "Leonard", "Leonardo", "Leonel", "Leonidas", "Leroy", "Levi", "Lewis", "Liam", "Lian", "Lincoln", "Lionel", "Lochlan", "Logan", "London", "Lorenzo", "Louie", "Louis", "Luca", "Lucas", "Lucca", "Lucian", "Luciano", "Luis", "Luka", "Lukas", "Luke", "Lyric", "Mac", "Mack", "Madden", "Maddox", "Magnus", "Maison", "Major", "Makai", "Malachi", "Malakai", "Malcolm", "Malik", "Manuel", "Marcel", "Marcellus", "Marcelo", "Marco", "Marcos", "Marcus", "Mario", "Mark", "Marley", "Marlon", "Marshall", "Martin", "Marvin", "Mason", "Mateo", "Mathew", "Mathias", "Matias", "Matteo", "Matthew", "Matthias", "Maurice", "Mauricio", "Maverick", "Max", "Maximilian", "Maximiliano", "Maximo", "Maximus", "Maxton", "Maxwell", "Mccoy", "Mekhi", "Melvin", "Memphis", "Messiah", "Micah", "Michael", "Miguel", "Milan", "Miles", "Miller", "Milo", "Misael", "Mitchell", "Mohamed", "Mohammad", "Mohammed", "Moises", "Mordechai", "Morgan", "Moses", "Moshe", "Muhammad", "Murphy", "Musa", "Myles", "Mylo", "Nash", "Nasir", "Nathan", "Nathanael", "Nathaniel", "Nehemiah", "Neil", "Nelson", "Nicholas", "Nico", "Nicolas", "Niklaus", "Niko", "Nikolai", "Nikolas", "Nixon", "Noah", "Noe", "Noel", "Nolan", "Nova", "Oakley", "Ocean", "Odin", "Oliver", "Omar", "Omari", "Onyx", "Orion", "Orlando", "Oscar", "Osiris", "Otis", "Otto", "Owen", "Pablo", "Parker", "Patrick", "Paul", "Paxton", "Pedro", "Peter", "Peyton", "Philip", "Phillip", "Phoenix", "Pierce", "Porter", "Preston", "Prince", "Princeton", "Quentin", "Quincy", "Quinn", "Quinton", "Rafael", "Raiden", "Ramon", "Randy", "Raphael", "Raul", "Ray", "Rayan", "Rayden", "Raylan", "Raymond", "Reece", "Reed", "Reese", "Reginald", "Reid", "Reign", "Remi", "Remington", "Remy", "Rene", "Reuben", "Rex", "Rey", "Rhett", "Rhys", "Ricardo", "Richard", "Ricky", "Ridge", "Riggs", "Riley", "Rio", "River", "Robert", "Roberto", "Robin", "Rocco", "Rocky", "Rodney", "Rodrigo", "Rogelio", "Roger", "Rohan", "Roland", "Roman", "Rome", "Romeo", "Ronald", "Ronan", "Ronin", "Rory", "Rowan", "Rowen", "Roy", "Royal", "Royce", "Ruben", "Rudy", "Russell", "Ryan", "Ryder", "Ryker", "Rylan", "Ryland", "Sage", "Saint", "Salem", "Salvador", "Salvatore", "Sam", "Samir", "Samson", "Samuel", "Santana", "Santiago", "Santino", "Santos", "Saul", "Sawyer", "Scott", "Sean", "Sebastian", "Sergio", "Seth", "Seven", "Shane", "Shawn", "Shepard", "Shepherd", "Shiloh", "Silas", "Simon", "Sincere", "Skyler", "Solomon", "Sonny", "Soren", "Spencer", "Stanley", "Stefan", "Stephen", "Sterling", "Stetson", "Steven", "Sullivan", "Sutton", "Sylas", "Tadeo", "Talon", "Tanner", "Tate", "Tatum", "Taylor", "Terrance", "Terry", "Thaddeus", "Thatcher", "Theo", "Theodore", "Thiago", "Thomas", "Timothy", "Titan", "Titus", "Tobias", "Tomas", "Tommy", "Tony", "Trace", "Travis", "Trent", "Trenton", "Trevor", "Trey", "Tripp", "Tristan", "Tristen", "Troy", "Tru", "Truett", "Tucker", "Turner", "Ty", "Tyler", "Tyson", "Ulises", "Uriah", "Uriel", "Valentin", "Valentino", "Van", "Vance", "Vicente", "Victor", "Vihaan", "Vincent", "Vincenzo", "Wade", "Walker", "Wallace", "Walter", "Warren", "Watson", "Waylon", "Wayne", "Wells", "Wes", "Wesley", "Wesson", "Westin", "Westley", "Weston", "Wilder", "Will", "William", "Willie", "Wilson", "Winston", "Wyatt", "Xander", "Xavier", "Xzavier", "Yahir", "Yehuda", "Yosef", "Yousef", "Yusuf", "Zachariah", "Zachary", "Zahir", "Zaid", "Zaiden", "Zain", "Zaire", "Zakai", "Zander", "Zane", "Zavier", "Zayd", "Zayden", "Zayn", "Zayne", "Zechariah", "Zeke", "Zev", "Zion", "Zyair", "Zyaire"};



        String search= "Seven";
        int ops=0;
        for (int i = 0; i <topNames.length ; i++) {
            ops ++;
            if (topNames[i]== search){
                System.out.println(search+ " is ranked "+i);
               break;
            }
        }
        System.out.println("Sequential search operations O(n) : "+ ops);



        Hashy hashy= new Hashy(topNames.length);

       //Lägg in alla personer i vår Hashtabell
        for (int i = 0; i <topNames.length ; i++) {
            hashy.add(new Person(topNames[i],i));
        }
        System.out.println("Total collisions: "+ hashy.totalCollisions);


        System.out.println(search+ " is ranked "+hashy.search(search).getRank());


        System.exit(0);



        Graphy graphy = new Graphy();
        graphy.addNode("sk", "Skojrta");
        graphy.addNode("sl", "Slips");
        graphy.addNode("je", "Jeans");
        graphy.addNode("cr", "Crocs");

        graphy.addEdge("sk", "sl");
        graphy.addEdge("sk", "je");
        graphy.addEdge("sl", "je");
        graphy.addEdge("sl", "sk");
        graphy.addEdge("je", "sk");
        graphy.addEdge("je", "sl");
        graphy.addEdge("je", "cr");
        graphy.addEdge("cr", "je");

        System.out.println(graphy.toString());


        System.exit(0);
        String[] weekDays = {"må", "ti", "on", "to", "fr", "lö", "sö"};
        String[] testData = {"ZOZO", "Ruuben", "Kimi", "Wille"};
        String[] sortedData = {"Kimi", "Ruuben", "Wille", "zozo"};

        int today = 3;  //torsdag
        System.out.printf("Idag är det %s\n", weekDays[today]);
        System.out.printf("I övermorgon är det %s\n", weekDays[(today + 2) % weekDays.length]);
        System.out.printf("Om 6 dagar är det %s\n", weekDays[(today + 6) % weekDays.length]);

        /**
         * Stack
         */
        Stacky stacky = new Stacky(5);
        stacky.push("zozo");
        stacky.push("ruuben");
        stacky.push("kimi");
        stacky.push("Juuuu");
        stacky.push("VVVVV");
        System.out.println(stacky.toString());


        /**
         * Linked list
         */
        Person frodo = new Person(testData[0]);
        Person sam = new Person(testData[1]);
        Person gandalf = new Person(testData[2]);
        Person wille = new Person(testData[3]);

        Linky linky = new Linky();
        linky.add(frodo);
        linky.add(sam);
        linky.add(gandalf);


        System.out.println(linky.toString());
        System.out.println("Linky has:" + linky.size());
        linky.add(wille);
        System.out.println(linky.toString());
        System.out.println("Linky has:" + linky.size());


      /*
       Queuey queuey= new Queuey();
        Graphy graphy= new Graphy();
        queuey.enqueu("Zozo");
        queuey.enqueu("Ruuben");
        queuey.enqueu("Kimi");
        System.out.println(queuey.toString());
        System.out.println("First in line: "+ queuey.peek());

        System.out.println("DEQUEUE: "+queuey.dequeue());
        System.out.println(queuey.toString());






      Person p1= new Person(testData[0]);
        Person p2= new Person(testData[1], p1);
        Person p3= new Person(testData[2],p2);
        Person p4= new Person(testData[3],p3);




        Person current=p4;

        while(current !=null){
            System.out.println(current.getName());
            current=current.next;
        }
 */

       /* StringArray names = new StringArray(sortedData);
        System.out.println(names.toString());
        names.add("Gollum");
        System.out.println(names.toString());

        names.reverse();
        System.out.println(names.toString());


        System.exit(0);
        // testa looppa olika tidskomplixitet
        new BigO();

        */


        //upcasting
        //Vehicle car = new Car("Toyota", 3000.0);
        //Vehicle bike = new Bike("Scott", 100);
        //Car car2 = new Car("Fiat");
        //car2.refuel();
        //Car car3 = new Car(2000.0);
        //Car car4 = new Car("Tesla", 2000.0);
        //Vehicle todaysVehicle;
        //todaysVehicle = car;
        //todaysVehicle = bike;
        // default-konstruktor
        //Foo foo = new Foo();
        //upcasting
        //Clothing shirt = new Shirt("Red", "Polo", 100);
        //Shirt shirt2 = new Shirt("Yellow", "Nike", 99.9999);
        //Pants pants= new Pants("Black", "Levis", "150$");


        //FileUtils.writeTextFile("Hello file", "hello.txt");
        // System.out.println(FileUtils.readTextFile("hello.txt"));
        //Customer customer;
        //  Object loadedObject = FileUtils.loadObject("customer.save");
        //if (loadedObject != null) {
         /*   customer = (Customer) loadedObject;
        } else {
            customer = new Customer(1500);
        }

        System.out.printf("Välkommen till cykelbutiken. Du har %.2f euro och %s.",
                customer.getFunds(),
                (customer.getCurrentBike()) == null ? "ingen cykel" : customer.getCurrentBike().getName()
        );

        BikeShop shop = new BikeShop();
        shop.addBike(BikeFactory.createExpensiveBike("Scott"));
        shop.addBike(BikeFactory.cheapExpensiveBike("Pask"));
        shop.addBike(new Bike("Helkama", 90, DiscountCategory.DEMO));
        shop.addBike(new Bike("Niskahiki", 5000, DiscountCategory.RETURNED));


        for (int i = 0; i < shop.getBikeCount(); i++) {

            System.out.printf("\n%d - %s %.2f € (%.2f) lagersaldo: %s %s\n",
                    i,
                    shop.getBike(i).getName(),
                    shop.getBike(i).getPrice(),
                    shop.getBike(i).getGrossPrice(),
                    shop.getBike(i).getStock(),
                    shop.getBike(i).getDiscountCat()
            );
            System.out.println(shop.getBike(i).getFeatures());
        }


        String userInput;
        while (true) {

            System.out.print("Vilken cykel vill du köpa? (q för quit)");

            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Tack, välkommen åter!");
                break;
            }
            if (!Utils.isInteger(userInput)) {
                System.out.println("Du måste ge ett heltal!");
                continue;
            }

            int bikeIndex = Integer.parseInt(userInput);
            if (bikeIndex >= shop.getBikeCount()) {
                System.out.println("Det finns ingen sådan cykel!");
            }

            if (!customer.buyBike(shop.getBike(bikeIndex))) {
                System.out.println("Du har inte råd med den cykeln");
                continue;
            }


            System.out.printf("Grattis, du köpte en %s för %.2f\n",
                    shop.getBike(bikeIndex).getName(),
                    shop.getBike(bikeIndex).getPrice()
            );
            break;
        }
        FileUtils.saveObject(customer, "customer.save");

        // int userIntInput= Utils.getIntInput();  code challenge

        // shop.getBike(0).addFeature("suspension", "hardtail");
        // shop.getBike(0).addFeature("wheelsize", "24-inch");
        // System.out.println(shop.getBike(0).getFeature("suspension"));
        //System.out.println(shop.getBike(0).getFeature("wheelsize"));

      /*
        System.out.println("Här genereras slumptal!(q för exit)");
        String userInput1;


        while (true) {

            RandomNum x= new RandomNum();
            userInput1 = scanner.nextLine();

            {
                if (userInput1.equalsIgnoreCase("")) {
                    System.out.println("Slumptal: " + x.getNumber());
                } else if (userInput1.equalsIgnoreCase("q")) {
                    break;
                }

            }




        }
*/


// Konkatenering:

    /*    System.out.println(shirt.getBrand());
            System.out.println(shirt2.getCondition());
            System.out.println(shirt2.getBrand() + " kostar " + shirt2.getPrice() + " lagersaldo: " + shirt2.getStock());
            System.out.printf("%s kostar %.2f €, lagersaldo: %d st\n",
                    shirt2.getBrand(),
                    shirt2.getPrice(),
                    shirt2.getStock());
            // String format () returnerar en string             shirtInfo = String.format("%s kostar %.2f €, lagersaldo: %d st",
                    shirt2.getBrand(),
                    shirt2.getPrice(),
                    shirt2.getStock());
            System.out.println(shirtInfo);


            //car.setPrice(-1000.0);, kontrollering för runtime juttun
            //System.out.println("Idag åker jag "+ todaysVehicle.getName());
            //System.out.println("Bilen " + car.getName()+" kostar " + car.getPrice());
            //System.out.println(car.soundWarning());
            //System.out.println(car.getName()+ " is "+ car.getType());
            //System.out.println(bike.getName()+ " is "+ bike.getType());
            //System.out.println(bike.soundWarning());
            //System.out.println("This shirt is "+ shirt.getColor() +" and the brand is " + shirt.getBrand()+ " the price is "+ shirt.getPrice());
            //System.out.println("This one on the other hand is "+ shirt2.getColor()+" and the brand is " + shirt2.getBrand()+" the price is "+shirt2.getPrice());
            //System.out.println("These jeans are "+pants.getColor()+" they are made by "+ pants.getBrand()+" which is why they cost "+pants.getPrice());*/
    }


}

