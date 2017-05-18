package epam.androidlab.com.hometask6.data;

import java.util.ArrayList;

import epam.androidlab.com.hometask6.R;


public class DogsEnum {

    public static ArrayList<DogDescription> getDogs(){
        ArrayList<DogDescription> dogs = new ArrayList<>();
        DogDescription dogDes = new DogDescription();

        dogDes.setName("rottweiler");
        dogDes.setPicture(R.drawable.rottweiler);
        dogs.add(dogDes);

        dogDes=new DogDescription();
        dogDes.setName("poodle");
        dogDes.setPicture(R.drawable.poodle);
        dogs.add(dogDes);

        dogDes=new DogDescription();
        dogDes.setName("bulldog");
        dogDes.setPicture(R.drawable.bulldog);
        dogs.add(dogDes);

        dogDes=new DogDescription();
        dogDes.setName("Chow Chow");
        dogDes.setPicture(R.drawable.chow_chow);
        dogs.add(dogDes);

        dogDes=new DogDescription();
        dogDes.setName("chihuahua");
        dogDes.setPicture(R.drawable.chihuahua);
        dogs.add(dogDes);

        dogDes=new DogDescription();
        dogDes.setName("pekingese");
        dogDes.setPicture(R.drawable.pekingese);
        dogs.add(dogDes);

        dogDes=new DogDescription();
        dogDes.setName("Shar Pei");
        dogDes.setPicture(R.drawable.shar_pei);
        dogs.add(dogDes);

        dogDes=new DogDescription();
        dogDes.setName("Shiba Inu");
        dogDes.setPicture(R.drawable.shiba_inu);
        dogs.add(dogDes);

        dogDes=new DogDescription();
        dogDes.setName("Bull Terrier");
        dogDes.setPicture(R.drawable.bull_terrier);
        dogs.add(dogDes);

        dogDes=new DogDescription();
        dogDes.setName("pug");
        dogDes.setPicture(R.drawable.pug);
        dogs.add(dogDes);

        return dogs;
    }
}
