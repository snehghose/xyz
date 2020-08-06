import React, { Component } from 'react';

class Product extends Component {
    constructor(props) {
        super(props)
    }

    render() {
        console.log(this.props.product);
        return (
            <div className="card mx-auto my-3">
                <div className="embed-responsive embed-responsive-4by3">
                    <img className="card-img-top embed-responsive-item" src={this.props.product.imageUrl} alt="image"/>
                    </div>
                <div className="card-body">
                    <span className="text-muted size"><strong>{this.props.product.name}</strong></span>
                    <span className="text-danger size float-right">₹{this.props.product.price}</span>
                    <div className="text-muted">{this.props.product.quantityType}</div>
                    <button className="w-100 btn btn-danger mt-2">ADD TO CART</button>
                </div>
            </div>
        )
    }
}

export default Product;