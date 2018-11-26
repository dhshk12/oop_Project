import java.util.List;

class Piece extends Game {

    static class Location
    {
        int posX;
        int posY;
        Location(){}
    }

    private Location loc;
    private int strength ;
    private int team;
    private String symbol;


    public boolean move(Location to,Object[][] board)
    {
        boolean flag;
        Piece p= (Piece) board[to.posX][to.posY];
        if(board[to.posX][to.posY].equals(Water.class))         //water
        {
            System.out.println("Invalid move");
            return false;
        }
        else if(to.posX==loc.posX && Math.abs(to.posY-loc.posY)==1)  // moving horizontally
        {
            if(this.getTeam()!=p.getTeam() && (p.getTeam()!=2))
            {
                flag=capture(p,board);
                return flag;
            }else if(this.getTeam()==p.getTeam() &&  (p.getTeam()!=2) && p.getClass()!=Trap.class) //capturing same piece
            {
                System.out.println("Invalid Move");
                return false;
            }
            Object swap;
            swap=board[loc.posX][loc.posY];
            board[loc.posX][loc.posY]=board[to.posX][to.posY];
            board[to.posX][to.posY]=swap;
        }
        else if(to.posY==loc.posY && Math.abs(to.posX-loc.posX)==1)  //moving vertically
        {
            if(this.getTeam()!=p.getTeam() && (p.getTeam()!=2))
            {
                flag=capture(p,board);
                return flag;
            }else if(this.getTeam()==p.getTeam() &&  (p.getTeam()!=2) && p.getClass()!=Trap.class) //capturing same piece
            {
                System.out.println("Invalid Move");
                return false;
            }else if(p.getClass()==Trap.class)
            {

            }
            Object swap;
            swap=board[loc.posX][loc.posY];
            board[loc.posX][loc.posY]=board[to.posX][to.posY];
            board[to.posX][to.posY]=swap;
        }else
        {
            System.out.println("Invalid move");
            return false;
        }


        return true;
    }

    public boolean capture(Piece other,Object[][] board)
    {
       if(this.getStrength()>=other.getStrength())
        {
            Object swap=board[loc.posX][loc.posY];
            other.setSymbol("0");

            board[loc.posX][loc.posY]= other;
            board[other.getLocation().posX][other.getLocation().posY]=swap;

            Piece p=(Piece)board[other.getLocation().posX][other.getLocation().posY];
            p.setLocation(other.getLocation().posX,other.getLocation().posY);

                if(other.getTeam()==0)
                {
                }else if(other.getTeam()==1)
                {
                }
        } else
        {
            System.out.println("Can't capture.");
            return false;
        }

        return true;
    }

    public void setStrength(int stg)
    {
       this.strength=stg;
    }

    public void setTeam(int side)
    {
        this.team=side;
    }
    public int getStrength()
    {
        return this.strength;
    }
    public int getTeam()
    {
        return this.team;
    }

    public void setLocation(int x, int y)
    {
        Location newLoc= new Location();
        newLoc.posX=x;
        newLoc.posY=y;
        this.loc=newLoc;
    }

    public Location getLocation()
    {
        return this.loc;
    }

    public String getSymbol()
    {
        return this.symbol;
    }

    public void setSymbol(String letter)
    {
        this.symbol=letter;
    }



}
