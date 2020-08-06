import React, { Component } from 'react';
import CartService from '../../services/CartService';

class Product extends Component {
    constructor(props) {
        super(props)
        this.state={flag:false, productId:''}
        this.handleAddToCart=this.handleAddToCart.bind(this)
    }

    async handleAddToCart() {
        var check=await CartService.addToCart(this.props.product.id);
        if(check===true) {
            this.setState({flag:true, productId:this.props.product.id})
            setTimeout(()=>this.setState({flag:false, productId:''}),2000)
        }
    }

    render() {
        const product = this.props.product;
        return (
            <div className="card mx-auto my-3">
                <div className="embed-responsive embed-responsive-4by3">
                    <img className="card-img-top embed-responsive-item" src={product.imageUrl} alt={product.name}/>
                </div>
                <div className="card-body">
                    <span className="text-muted size"><strong>{product.name}</strong></span>
                    <span className="text-danger size float-right">₹{product.price}</span>
                    <div className="text-muted">{product.quantityType}</div>
                    <button className="w-100 btn btn-danger mt-2" onClick={this.handleAddToCart}>ADD TO CART</button>
                    {this.state.flag===true && this.state.productId===product.id && (
                        <div className="text-success text-center mt-2">
                            <strong>Added to Cart</strong>
                        </div>
                    )}
                </div>
            </div>
        )
    }
}

export default Product;