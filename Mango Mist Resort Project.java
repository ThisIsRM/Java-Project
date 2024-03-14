import java.util.*;
class MangoMist
{
    static int a=0;
    static String cusnme[]=new String[20]; 
    static String cusadr[]=new String[20];
    static String cusidr[]=new String[20];
    static String cusph[]=new String[20];
    static String cusadd[]=new String[20];
    static String emilid[]=new String[20];
    static int chldno[]=new int[20];
    static int noadlt[]=new int[20];
    static int totlamt1[]=new int[20];
    static int totlamt2[]=new int[20];
    static int totlamt[]=new int[20];    
    public static void main()
    {
        Scanner sc=new  Scanner(System.in);
        MangoMist obj = new MangoMist();
        int q;
        do
        {
            System.out.println("             ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
            System.out.println("             ♥♥♥♥                                           ♥♥♥♥");
            System.out.println("             ♥♥♥♥               WELCOME TO RESORT           ♥♥♥♥");
            System.out.println("             ♥♥♥♥              *------*****------*          ♥♥♥♥");
            System.out.println("             ♥♥♥♥                                           ♥♥♥♥");
            System.out.println("             ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
            System.out.println("                                                                                 ");
            System.out.println("             ♠♠    ♠ ♠      ♠♠      ♠♠    ♠  ♠♠♠♠♠    ♠♠♠♠♠                        ");
            System.out.println("             ♠ ♠  ♠  ♠     ♠  ♠     ♠ ♠   ♠  ♠       ♠      ♠                     ");
            System.out.println("             ♠  ♠ ♠  ♠    ♠    ♠    ♠  ♠  ♠  ♠  ♠♠♠  ♠      ♠                     ");
            System.out.println("             ♠   ♠   ♠   ♠  --  ♠   ♠   ♠ ♠  ♠   ♠♠  ♠      ♠                     ");
            System.out.println("             ♠       ♠  ♠        ♠  ♠    ♠♠  ♠♠♠♠♠    ♠♠♠♠♠♠                       ");
            System.out.println("                                                                                 ");
            System.out.println("                                                                                 ");
            System.out.println("             ♠♠     ♠♠  ♠♠♠♠♠♠  ♠♠♠♠♠   ♠♠♠♠♠♠♠♠                                    ");
            System.out.println("             ♠ ♠   ♠ ♠    ♠    ♠          ♠                                       ");
            System.out.println("             ♠  ♠ ♠  ♠    ♠     ♠♠♠♠♠      ♠                                      ");
            System.out.println("             ♠   ♠   ♠    ♠         ♠      ♠                                      ");
            System.out.println("             ♠       ♠  ♠♠♠♠♠♠   ♠♠♠♠♠      ♠                                      ");
            System.out.println("                                                                                        ");
            System.out.println("             Welcome to MANGO MIST RESTORT for those who are ready                      ");
            System.out.println("             for their adventurous experience and enjoyment, resort                     ");
            System.out.println("             is for you.We offer you a lot of things here.so feel free                  ");
            System.out.println("             because we are here for you.                                               ");
            System.out.println("             would you like to:                                                         ");
            System.out.println("                      1.Book rooms                                                      ");
            System.out.println("                      2.Play games                                                      ");
            System.out.println("                      3.Go for a single day adventure                                   ");
            System.out.println("                      4.Go for disco party           and                                ");
            System.out.println("                      5.Quit                                                            ");
            System.out.println("                      Please enter your choice                                                 ");
            System.out.println("______________________________________________________________________________________________________________________");
            q=sc.nextInt();
            switch (q)
             {
                case 1:
                obj.BR();
                break;
                case 2:
                obj.PG();
                break;
                case 3:
                obj.SDA();
                break;
                case 4:
                obj.DP();
                break;
                case 5:
                System.exit(0);
                break;
                default:                              
                System.out.println("OOPS !! WRONG CHOICE... PLEASE ENTER YOUR CHOICE CORRECTLY");
                                                   try
                {
                        System.out.println("Enter the number again");
                            int n = sc.nextInt();
                }
                     catch( Exception e)
                 {
                            System.out.println("Enter the number again");
                            String ni =sc.next();
                 }
             }
         }
        while (q>0);
     }     
    void BR()
    {                
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("WE OFFER FOUR TYPES OF ROOMS:");
         System.out.println("Enter the room you wish to open:");
         System.out.println("1.Double bedroom without AC and tub");
         System.out.println("2.Double bedroom with AC and tub");
         System.out.println("3.Exit");
         int romtyp = sc.nextInt();
         switch(romtyp)
         {
             case 1:
             obj.DBWAT();
             break;
             case 2:
             obj.DBAT();
             break;
             case 3:
             System.exit(0);
             break;
             default:                              
             System.out.println("OOPS !! WRONG CHOICE... PLEASE ENTER YOUR CHOICE CORRECTLY");
             try
             {
                 System.out.println("Enter the number again");
                 int n = sc.nextInt();
             }
                 catch( Exception e)
             {
                 System.out.println("Enter number again");
                 String ni =sc.next();
             }
         }
         System.out.println("________________________________________________________________________________________________________________________");
    }
    void DBWAT()    
    {     
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("For how many days are you booking this room for:");
         System.out.println("This room is available for:");
         System.out.println("1.2 days");
         System.out.println("2.5 days");
         System.out.println("3.Exit");
         int nosday = sc.nextInt();
         switch(nosday)
         {
             case 1:
             obj.TD();
             break;
             case 2:
             obj.FD();
             break;
             case 3:
             System.exit(0);
             break;
             default:                              
             System.out.println("OOPS !! WRONG CHOICE... PLEASE ENTER YOUR CHOICE CORRECTLY");
             try
             {
                 System.out.println("Enter the number again");
                 int n = sc.nextInt();
             }
                 catch( Exception e)
             {
                 System.out.println("Enter number again");
                 String ni =sc.next();
             }
          }
         System.out.println("________________________________________________________________________________________________________________________");
    }
    void TD()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("  We charge : Rs.500 for small children below 13 and ");
         System.out.println("  Rs.900 for an adult per head.                      ");
         System.out.println("                                                     ");
         System.out.println("Enter your name");
         cusnme[a]=sc.next();                
         System.out.println("Enter the number of children below 13");
         chldno[a]=sc.nextInt(); 
         System.out.println("Enter number of adults");
         noadlt[a]=sc.nextInt();
         System.out.println("Enter your phone number");
         cusph[a]=sc.next();       
         System.out.println("Enter your address");
         cusadd[a]=sc.next();
         System.out.println("Enter your e-mail ID");
         emilid[a]=sc.next(); 
         System.out.println("Enter your voter ID number");
         cusidr[a]=sc.next();
         System.out.println("Enter your aadhar number");
         cusadr[a]=sc.next();
         totlamt1 [a]=500*chldno[a];
         totlamt2 [a]=900*noadlt[a];
         totlamt[a]=(totlamt1[a]+totlamt2[a])*2;
         System.out.println("-----------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your phone number:"+cusph[a]);
         System.out.println("Your room has been booked...........");
         System.out.println("And your total amount:"+totlamt[a]);         
    }
     void FD()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("  We charge : Rs.500 for small children below 13 and ");
         System.out.println("  Rs.900 for an adult per head.                      ");
         System.out.println("                                                     ");
         System.out.println("Enter your name");
         cusnme[a]=sc.next();                
         System.out.println("Enter the number of children below 13");
         chldno[a]=sc.nextInt(); 
         System.out.println("Enter number of adults");
         noadlt[a]=sc.nextInt();
         System.out.println("Enter your phone number");
         cusph[a]=sc.next();       
         System.out.println("Enter your address");
         String cusadd =sc.next();
         System.out.println("Enter your e-mail ID");
         emilid[a]=sc.next(); 
         System.out.println("Enter your voter ID number");
         cusidr[a]=sc.next();
         System.out.println("Enter your aadhar number");        
         cusadr[a]=sc.next();
         totlamt1[a]=500*chldno[a];
         totlamt2[a]=900*noadlt[a];
         totlamt[a]=(totlamt1[a]+totlamt2[a])*5;
         System.out.println("-----------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your phone number:"+cusph[a]);
         System.out.println("Your room has been booked.......here are your keys");   
         System.out.println("And your total amount:"+totlamt[a]);            
    }
    void DBAT()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("For how many days are you booking this room for:");
         System.out.println("This room is available for:");
         System.out.println("1.2 days");
         System.out.println("2.5 days");
         System.out.println("3.Exit");
         int nosday = sc.nextInt();
         switch(nosday)
         {
             case 1:
             obj.TttD();
             break;
             case 2:
             obj.FffD();
             break;
             case 3:
             System.exit(0);
             break;
             default:                              
             System.out.println("OOPS !! WRONG CHOICE... PLEASE ENTER YOUR CHOICE CORRECTLY");
             try
             {
                 System.out.println("Enter the number again");
                 int n = sc.nextInt();
             }
                 catch( Exception e)
             {
                 System.out.println("Enter number again");
                 String ni =sc.next();
             }
         }
         System.out.println("________________________________________________________________________________________________________________________");  
       }
    void TttD()
      {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("  We charge : Rs.1000 for small children below 13 and ");
         System.out.println("  Rs.2000 for an adult per head.                      ");
         System.out.println("                                                     ");
         System.out.println("Enter your name");
         cusnme[a]=sc.next();                
         System.out.println("Enter the number of children below 13");
         chldno[a]=sc.nextInt(); 
         System.out.println("Enter number of adults");
         noadlt[a]=sc.nextInt();
         System.out.println("Enter your phone number");
         cusph[a]=sc.next();       
         System.out.println("Enter your address");
         String cusadd =sc.next();
         System.out.println("Enter your e-mail ID");
         emilid[a]=sc.next(); 
         System.out.println("Enter your voter ID number");
         cusidr[a]=sc.next();
         System.out.println("Enter your aadhar number");        
         cusadr[a]=sc.next();
         totlamt1[a]=1000*chldno[a];
         totlamt2[a]=2000*noadlt[a];
         totlamt[a]=(totlamt1[a]+totlamt2[a])*2;
         System.out.println("-----------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your phone number:"+cusph[a]);
         System.out.println("Your room has been booked.......here are your keys"); 
         System.out.println("And your total amount:"+totlamt[a]);         
        
    }
    void FffD()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("  We charge : Rs.1000 for small children below 13 and ");
         System.out.println("  Rs.2000 for an adult per head.                      ");
         System.out.println("                                                     ");
         System.out.println("Enter your name");
         cusnme[a]=sc.next();                
         System.out.println("Enter the number of children below 13");
         chldno[a]=sc.nextInt(); 
         System.out.println("Enter number of adults");
         noadlt[a]=sc.nextInt();
         System.out.println("Enter your phone number");
         cusph[a]=sc.next();       
         System.out.println("Enter your address");
         String cusadd =sc.next();
         System.out.println("Enter your e-mail ID");
         emilid[a]=sc.next(); 
         System.out.println("Enter your voter ID number");
         cusidr[a]=sc.next();
         System.out.println("Enter your aadhar number");        
         cusadr[a]=sc.next();
         totlamt1[a]=1000*chldno[a];
         totlamt2[a]=2000*noadlt[a];
         totlamt[a]=(totlamt1[a]+totlamt2[a])*5;
         System.out.println("-----------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your phone number:"+cusph[a]);
         System.out.println("Your room has been booked.......here are your keys"); 
         System.out.println("And your total amount:"+totlamt[a]);         
    }
    void PG()
    {
        Scanner sc=new  Scanner(System.in);      
        MangoMist obj = new MangoMist();
        System.out.println("  WE OFFER YOU TWO TYPES OF GAMES HERE:");
        System.out.println(" 1. INDOOR GAMES");
        System.out.println(" 2. OUTDOOR GAMES");
        System.out.println(" 3.Exit");
        System.out.println("Enter ypur choice");
        int gmno=sc.nextInt();
        switch(gmno)
         {
             case 1:
             obj.IG();
             break;
             case 2:
             obj.OG();
             break;
             case 3:
             System.exit(0);
             break;
             default:                              
             System.out.println("OOPS !! WRONG CHOICE... PLEASE ENTER YOUR CHOICE CORRECTLY");
             try
             {
                 System.out.println("Enter the number again");
                 int n = sc.nextInt();
             }
                 catch( Exception e)
             {
                 System.out.println("Enter number again");
                 String ni =sc.next();
             }
          }
         System.out.println("________________________________________________________________________________________________________________________");
    }
    void IG()
    {
        Scanner sc=new  Scanner(System.in);      
        MangoMist obj = new MangoMist();
        System.out.println("  WE OFFER YOU A LOT OF INDOOR GAMES SUCH AS:");
        System.out.println(" 1.CHESS");
        System.out.println(" 2.CARROM");
        System.out.println(" 3.TABLE TENNIS");
        System.out.println(" 4.SWIMMING");
        System.out.println(" 5.EXIT");
        System.out.println("Enter your choice");
        int igno=sc.nextInt();
        switch(igno)
         {
             case 1:
             obj.C();
             break;
             case 2:
             obj.CA();
             break;
             case 3:
             obj.TT();
             break;
             case 4:
             obj.SW();
             break;
             case 5:
             System.exit(0);
             break;
             default:                              
             System.out.println("OOPS !! WRONG CHOICE... PLEASE ENTER YOUR CHOICE CORRECTLY");
             try
             {
                 System.out.println("Enter the number again");
                 int n = sc.nextInt();
             }
                 catch( Exception e)
             {
                 System.out.println("Enter number again");
                 String ni =sc.next();
             }
          }
         System.out.println("________________________________________________________________________________________________________________________");
    }
    void C()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();                
         System.out.println("Enter number of players");
         noadlt[a]=sc.nextInt();
         int pls=200*noadlt[a];
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+pls);    
         System.out.println("Here is your coupon.......... please collect it");         
        }
    void CA()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();                
         System.out.println("Enter number of players");
         noadlt[a]=sc.nextInt();
         int pls=300*noadlt[a];
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+pls);
         System.out.println("Here is your coupon.......... please collect it");         
        }
    void TT()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();                
         System.out.println("Enter number of players");
         noadlt[a]=sc.nextInt();
         int pls=300*noadlt[a];
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+pls);
         System.out.println("Here is your coupon.......... please collect it");         
    } 
    void SW()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();     
         System.out.println("For 1 hour we take Rs.100 per head");
         System.out.println("Enter the no of hours you are going to play");
         int nohrs=sc.nextInt();
         System.out.println("Enter number of players");
         noadlt[a]=sc.nextInt();
         int pls=100*noadlt[a];
         int jds=pls*nohrs;
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+jds);
         System.out.println("Here is your coupon.......... please collect it");         
    }      
    void OG()
    {
        Scanner sc=new  Scanner(System.in);      
        MangoMist obj = new MangoMist();
        System.out.println("  WE OFFER YOU A LOT OF INDOOR GAMES SUCH AS:");
        System.out.println(" 1.FOOTBALL");
        System.out.println(" 2.TENNIS");
        System.out.println(" 3.BASKET BALL");
        System.out.println(" 4.BIKE RIDING");
        System.out.println(" 5.HORSE RIDING");
        System.out.println(" 6.EXIT");
        System.out.println("Enter your choice");
        int igno=sc.nextInt();
        switch(igno)
         {
             case 1:
             obj.FTB();
             break;
             case 2:
             obj.TE();
             break;
             case 3:
             obj.BB();
             break;
             case 4:
             obj.BKR();
             break;
             case 5:
             obj.HOR();
             break;
             case 6:
             System.exit(0);
             break;
             default:                              
             System.out.println("OOPS !! WRONG CHOICE... PLEASE ENTER YOUR CHOICE CORRECTLY");
             try
             {
                 System.out.println("Enter the number again");
                 int n = sc.nextInt();
             }
                 catch( Exception e)
             {
                 System.out.println("Enter number again");
                 String ni =sc.next();
             }
          }
         System.out.println("________________________________________________________________________________________________________________________");
    }
    void FTB()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();                
         System.out.println("Enter number of players");
         noadlt[a]=sc.nextInt();
         int pls=200*noadlt[a];
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+pls);
         System.out.println("Here is your coupon.......... please collect it");         
    }
    void TE()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();         
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("This game is for free");
         System.out.println("Here is your coupon.......... please collect it");         
    }
    void BB()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();     
         System.out.println("For half an hour we take Rs.100 per head");
         System.out.println("Enter the no of hours you are going to play");
         double nohrs=sc.nextDouble();
         System.out.println("Enter number of players");
         noadlt[a]=sc.nextInt();
         double pls=100*noadlt[a];
         double jds=pls*nohrs;
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Here is your coupon.......... please collect it");         
    }
    void BKR()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();     
         System.out.println("For 1 hour we take Rs.350 per head");
         System.out.println("Enter the no of hours you are going to play");
         double nohrs=sc.nextDouble();
         System.out.println("Enter number of players");
         noadlt[a]=sc.nextInt();
         double pls=350*noadlt[a];
         double jds=pls*nohrs;
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+jds);
         System.out.println("Here is your coupon.......... please collect it");         
    }
    void HOR()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();     
         System.out.println("For 1 km we take Rs.90 per head");
         System.out.println("Enter the no of km you are going to ride");
         double nohrs=sc.nextDouble();
         System.out.println("Enter number of players");
         noadlt[a]=sc.nextInt();
         double pls=90*noadlt[a];
         double jds=pls*nohrs;
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+jds);
         System.out.println("Here is your coupon.......... please collect it");        
    }
    void SDA()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("WE OFFER A LOT OF ADVENRURES HERE:");
         System.out.println("1.SKY DIVING");
         System.out.println("2.BOAT RIDING");
         System.out.println("3.TRECKING");
         System.out.println("4.SPA");
         System.out.println("5.EXIT");
         int nosday = sc.nextInt();
         switch(nosday)
         {
             case 1:
             obj.SKD();
             break;
             case 2:
             obj.BORD();
             break;
             case 3:
             obj.TRK();
             break;
             case 4:
             obj.SPA();
             break;
             case 5:
             System.exit(0);
             break;
             default:                              
             System.out.println("OOPS !! WRONG CHOICE... PLEASE ENTER YOUR CHOICE CORRECTLY");
                                              try
             {
                 System.out.println("Enter the number again");
                 int n = sc.nextInt();
             }
                 catch( Exception e)
             {
                 System.out.println("Enter number again");
                 String ni =sc.next();
             }
          }
         System.out.println("________________________________________________________________________________________________________________________");  
        }
    void SKD()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next(); 
         System.out.println("For 1 jump we take 1000 per head under the conition: children above 15 is allowed");
         System.out.println("Enter the no of jumps you are going to play");
         double nohrs=sc.nextDouble();
         System.out.println("Enter number of players");
         noadlt[a]=sc.nextInt();
         double pls=1000*noadlt[a];
         double jds=pls*nohrs;
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+jds);
         System.out.println("Here is your coupon.......... please collect it");         
    }
    void BORD()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();     
         System.out.println("For half an hour we take Rs.200 per head");
         System.out.println("Enter the no of hours you are going to play");
         double nohrs=sc.nextDouble();
         System.out.println("Enter number of players");
         noadlt[a]=sc.nextInt();
         double pls=200*noadlt[a];
         double jds=pls*nohrs;
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+jds);
         System.out.println("Here is your coupon.......... please collect it");         
    }
    void TRK()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();     
         System.out.println("We take Rs.300 per head");
         System.out.println("Enter number of players");
         noadlt[a]=sc.nextInt();
         double pls=300*noadlt[a];
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+pls);
         System.out.println("Here is your coupon.......... please collect it");         
    }
    void SPA()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();     
         System.out.println("We offer you 2 types of spa");
         System.out.println("1.Fish");
         System.out.println("2.Body masage");
         System.out.println("Enter your choice");
         int spano=sc.nextInt();
         System.out.println("For 1 hour we take Rs.1000 per head");
         System.out.println("Enter the no of hours you are going to have massage");
         double nohrs=sc.nextDouble();
         System.out.println("Enter number of massage");
         noadlt[a]=sc.nextInt();
         double pls=1000*noadlt[a];
         double jds=pls*nohrs;
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+jds);
         System.out.println("Here is your coupon.......... please collect it");         
    }
    void DP()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("WE OFFER A LOT OF ADVENRURES HERE:");
         System.out.println("1.RAIN DANCE");
         System.out.println("2.CLUB WITH FOOD AND DRINKS");
         System.out.println("3.EXIT");
         int nosday = sc.nextInt();
         switch(nosday)
         {
             case 1:
             obj.RDD();
             break;
             case 2:
             obj.CWFAD();
             break;
             case 3:
             System.exit(0);
             break;
             default:                              
             System.out.println("OOPS !! WRONG CHOICE... PLEASE ENTER YOUR CHOICE CORRECTLY");
             try
             {
                 System.out.println("Enter the number again");
                 int n = sc.nextInt();
             }
                 catch( Exception e)
             {
                 System.out.println("Enter number again");
                 String ni =sc.next();
             }
          }
         System.out.println("________________________________________________________________________________________________________________________");  
        }
    void RDD()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();     
         System.out.println("For 1 hour we take Rs.1500 per head");
         System.out.println("Enter the no of hours you are going to rain dance");
         double nohrs=sc.nextDouble();
         System.out.println("Enter number of members");
         noadlt[a]=sc.nextInt();
         double pls=1500*noadlt[a];
         double jds=pls*nohrs;
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+jds);
         System.out.println("Here is your coupon.......... please collect it");         
    }
    void CWFAD()
    {
         Scanner sc=new  Scanner(System.in);      
         MangoMist obj = new MangoMist();
         System.out.println("Enter your name");
         cusnme[a]=sc.next();     
         System.out.println("Per head we take Rs.600 which is a buffet system");
         System.out.println("Enter number of members");
         noadlt[a]=sc.nextInt();
         double pls=600*noadlt[a];
         System.out.println("-----------------------------");
         System.out.println("Your name:"+cusnme[a]);
         System.out.println("Your total amount:"+pls);
         System.out.println("Here is your coupon.......... please collect it"); 
         System.out.println("Have a happy meal!!! :)");
    } 
}
