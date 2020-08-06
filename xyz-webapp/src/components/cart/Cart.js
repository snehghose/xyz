import React, { Component } from 'react';
import CartService from '../services/CartService';
import CartItem from './CartItem';

class Cart extends Component {
    constructor() {
        super();
        this.state={cart:null}
    }

    async componentWillMount() {
        this.setState({cart:await CartService.getCart()})
    }

    render() {
        if(this.state.cart===null)
        return(<></>)
        else
        return(
            <div className="container my-5">
                {this.state.cart.cartItems.length===0 && <>
                    <div className="alert alert-warning text-center">
                        Cart is empty.
                    </div>
                </>}
                {this.state.cart.cartItems.length>0 && 
                    <ul className="list-group">
                        {this.state.cart.cartItems.map((item)=>(
                            <CartItem key={item.product.id} item={item}/>
                        ))}
                        <li className="list-group-item">
                            <div className="row">
                                <div className="col-8 col-sm-10 blockquote my-auto">
                                    <strong>Total</strong>
                                </div>
                                <div className="col-4 col-sm-2 text-danger blockquote text-center my-auto">
                                    <strong>₹{this.state.cart.total}</strong>
                                </div>
                            </div>
                        </li>
                    </ul>
                }
            </div>
        )
    }
}

export default Cart;