const URL="http://localhost:8900/cart"
class CartService {

    async getCart() {
        const response=await fetch(URL);
        if(response.status===200)
        return await response.json();
        else {
            alert("Cannot fetch. Please reload.");
            window.location.reload(false)
        }
    }

    async addToCart(productId) {
        const response = await fetch(URL+`/add/${productId}`, {
            method='PUT'
        });
        if(response.status===200)
        return true;
        else {
            alert("Item not added to cart. Please reload.");
            window.location.reload(false)
        }
    }

    async deleteFromCart(productId) {
        const response = await fetch(URL+`/delete/${productId}`, {
            method='DELETE'
        });
        if(response.status!==200)
        alert("Item not added to cart. Please reload.");
        window.location.reload(false);
    }
}

export default new CartService();