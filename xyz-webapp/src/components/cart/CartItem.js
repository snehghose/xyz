import React, { Component } from 'react';
import CartService from '../services/CartService';

class CartItem extends Component {
    constructor(props) {
        super(props)
        this.handleAddToCart=this.handleAddToCart.bind(this);
        this.handleDeleteFromCart=this.handleDeleteFromCart.bind(this);
    }

    async handleAddToCart() {
        await CartService.addToCart(this.props.item.product.id)
        window.location.reload(false)
    }

    async handleDeleteFromCart() {
        await CartService.deleteFromCart(this.props.item.id)
        window.location.reload(false)
    }

    render() {
        const cartItem=this.props.item;
        return(
            <li className="list-group-item">
                <div className="row">
                    <div className="col-8 col-sm-10">
                        <div className="row">
                            <div className="col-12 col-sm-7">
                                <div className="row">
                                    <div className="col-12 col-md-6 blockquote my-auto">{cartItem.product.name}</div>
                                    <div className="col-12 col-md-6 text-muted my-auto">{cartItem.product.quantityType}</div>
                                </div>
                            </div>
                            <div className="col-12 col-sm-5 my-auto">
                                <i className="fa fa-minus-circle text-danger size" onClick={this.handleDeleteFromCart}></i>
                                <span className="px-2">{cartItem.quantity}</span>
                                <i className="fa fa-plus-circle text-danger size" onClick={this.handleAddToCart}></i>
                                <span className="ml-2">X ₹{cartItem.product.price}</span>
                            </div>
                        </div>
                    </div>
                    <div className="col-4 col-sm-2 text-success blockquote text-center my-auto">
                        ₹{cartItem.product.price*cartItem.quantity}
                    </div>
                </div>
            </li>
        )
    }
}

export default CartItem;