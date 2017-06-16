package model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Vero on 04/06/2017.
 */

public class Usuario {
    private String email;
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String value){
        this.email = value;
    }

    private String id;
    public String getId(){
        return this.id;
    }
    public void setId(String value){
        this.id = value;
    }

    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String value){
        this.name = value;
    }

    public void save () {
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();

        ref.child("usuarios").child(this.id).child("email").setValue(this.email);
        ref.child("usuarios").child(this.id).child("name").setValue(this.name);
    }
}
