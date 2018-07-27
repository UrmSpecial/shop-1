package shop.service;

import shop.model.ShoppingCart;

public interface ShoppingCartService {

    void addToCart(Long userId, Long cellphoneId, int amount);

    void removeItem(Long userId, Long cellphoneId);

    ShoppingCart findOneByUserId(Long userId);

    void clearCart(Long userId);

    void updateItemAmount(Long userId, Long cellphoneId, Integer amount);

}
