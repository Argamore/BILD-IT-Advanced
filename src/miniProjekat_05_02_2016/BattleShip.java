package miniProjekat_05_02_2016;
/** with help from progressivejava.net */
import java.util.Random;
public class BattleShip {
    public static void main(String[] args) {
    	// pravimo board velicine 5 * 5
        int[][] board = new int[5][5];
        // te 2D niz za brodove
        int[][] ships = new int[3][2];
        // niz za pucanje
        int[] shoot = new int[2];
        // brojace za broj pokušaja i broj pogodaka
        int attempts = 0,
            shotHit = 0;
        
        // pozivamo metode za tablu i brodove
        initBoard(board);
        initShips(ships);
        
        System.out.println();
        // prikazujemo sve to korisniku, i trazimo da "puca"
        do{
            showBoard(board);
            shoot(shoot);
            attempts++;
            
            if(hit(shoot,ships)){
                hint(shoot,ships,attempts);
                shotHit++;
            }                
            else
                hint(shoot,ships,attempts);
            
            changeboard(shoot,ships,board);
            

        }while(shotHit!=3);
        // ako je kraj, ispisuje poruku
        System.out.println("\n\n\nBattleship game finished! You hit 3 ships in "+attempts+" attempts.");
        showBoard(board);
    }
    // metoda za ispis table
    public static void initBoard(int[][] board){
        for(int row=0 ; row < 5 ; row++ )
            for(int column=0 ; column < 5 ; column++ )
                board[row][column]=-1;
    }
    // metoda za prikaz table
    public static void showBoard(int[][] board){
        System.out.println("\t1 \t2 \t3 \t4 \t5");
        System.out.println();
        
        for(int row=0 ; row < 5 ; row++ ){
            System.out.print((row+1)+"");
            // petlja koja upisuje karaktere u tablu
            // ako nije pucano na te koordinate, ispisuje ~ 
            // ako je pucano, ispisuje *
            // ako je pogoðen broj, ispisuje X
            for(int column=0 ; column < 5 ; column++ ){
                if(board[row][column]==-1){
                    System.out.print("\t"+"~");
                }else if(board[row][column]==0){
                    System.out.print("\t"+"*");
                }else if(board[row][column]==1){
                    System.out.print("\t"+"X");
                }
                
            }
            System.out.println();
        }

    }
    // metoda za ubacivanje brodova
    public static void initShips(int[][] ships){
        Random random = new Random();
        
        for(int ship=0 ; ship < 3 ; ship++){
            ships[ship][0]=random.nextInt(5);
            ships[ship][1]=random.nextInt(5);
            
            // provjeravamo da li smo slucajno 2 puta stavili brod na isto mjesto
            for(int last=0 ; last < ship ; last++){
                if( (ships[ship][0] == ships[last][0])&&(ships[ship][1] == ships[last][1]) )
                    do{
                        ships[ship][0]=random.nextInt(5);
                        ships[ship][1]=random.nextInt(5);
                    }while( (ships[ship][0] == ships[last][0])&&(ships[ship][1] == ships[last][1]) );
            }
            
        }
    }
    // metoda za pucanje
    public static void shoot(int[] shoot){
        try(java.util.Scanner input = new java.util.Scanner(System.in)){
        
        System.out.print("Row: ");
        shoot[0] = input.nextInt();
        shoot[0]--;
        
        System.out.print("Column: ");
        shoot[1] = input.nextInt();
        shoot[1]--;
        
        } catch (Exception e){
        	System.err.println("Error! Wrong input.");
        }
    }
    // metoda za provjeru da li je korisnik pogodio
    public static boolean hit(int[] shoot, int[][] ships){
        
        for(int ship=0 ; ship<ships.length ; ship++){
            if( shoot[0]==ships[ship][0] && shoot[1]==ships[ship][1]){
                System.out.printf("You hit a ship located in (%d,%d)\n",shoot[0]+1,shoot[1]+1);
                return true;
            }
        }
        return false;
    }
    // metoda koja pomaze korisniku i daje mu "hint" gdje se nalazi broj
    public static void hint(int[] shoot, int[][] ships, int attempt){
        int row=0,
            column=0;
        
        for(int line=0 ; line < ships.length ; line++){
            if(ships[line][0]==shoot[0])
                row++;
            if(ships[line][1]==shoot[1])
                column++;
        }
        
        System.out.printf("\nHint %d: \nRow %d -> %d ships\n" +
                                 "Column %d -> %d ships\n",attempt,shoot[0]+1,row,shoot[1]+1,column);
    }
    // metoda koja updatea tablu
    public static void changeboard(int[] shoot, int[][] ships, int[][] board){
        if(hit(shoot,ships))
            board[shoot[0]][shoot[1]]=1;
        else
            board[shoot[0]][shoot[1]]=0;
    }
}

