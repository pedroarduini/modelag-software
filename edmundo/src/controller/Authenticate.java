package controller;

import model.Marca;
import model.Influencer;
import model.User;
import model.UserType;

import java.util.HashMap;
import java.util.Map;

public class Authenticate {

    private static Map<String, User> users = new HashMap<>();

    static {
        Marca brand = new Marca();
        brand.setId(1L);
        brand.setPassword("marcaPass");
        brand.setEmail("marca@exemplo.com");

        Influencer influencer = new Influencer();
        influencer.setId(2L);
        influencer.setPassword("influencerPass");
        influencer.setEmail("influencer@examplo.com");

        users.put(brand.getEmail(), brand);
        users.put(influencer.getEmail(), influencer);
    }

    public User authenticate(String email, String password) {
        User user = users.get(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}

