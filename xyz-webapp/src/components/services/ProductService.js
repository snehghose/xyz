class ProductService {

    async getAllProducts() {
        const response=await fetch("http://localhost:8900/product");
        if(response.status===200)
        return await response.json()
        else {
            alert("Cannot fetch. Please reload.")
            window.location.reload(false)
        }
    }
    
}

export default new ProductService();