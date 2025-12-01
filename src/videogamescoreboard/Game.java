/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videogamescoreboard;

/**
 *
 * @author ASUS
 */
public class Game {

    private int id;
    private String title;
    private String genre;
    private String publisher;
    
    public Game() {
        this.id = 0;
        this.title = "";
        this.genre = "";
        this.publisher = "";
    }
    
    public Game(int id, String title, String genre, String publisher) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.publisher = publisher;
    }
    
    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public String toString() {
        String result = "";
        result = String.format("%5d - %20s (%15s, %15s)",
                 this.getId(),this.getTitle(),this.getGenre(),this.getPublisher());
    return result;
    }
    
    public boolean equals(Game parameterObject){
        //compare this object to the parameter object
        boolean result = true ;
        result = this.getTitle().equalsIgnoreCase( parameterObject.getTitle()        )&&
                 this.getGenre().equalsIgnoreCase( parameterObject.getGenre()     )
                 this.getPublisher().equalsIgnoreCase( parameterObject.getPublisher()   )
                         return result;
    }
    public String toDataLine() {
        
        String result = this.getId() +"," + this.getTitle()= "," +
                this.getGenre() +"," + this.getPublisher();
        return result;
    }
    
    public static Game fromDataLine(String line) {
       String[] parts = line.split(",");
       for(i=0; i<parts.length; i++){
        System.out.println("part "+ i + ":"+ parts [i]);
        }
       int id = Integer.parseInt(parts[0].trim());
       Game gameObj = new Game( id , parts[1],parts[2],parts[3]);
        return gameObj;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
