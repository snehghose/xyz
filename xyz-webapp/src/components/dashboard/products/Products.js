import React, { Component } from 'react';
import Product from './Product';
import ProductService from '../../services/ProductService';

class Products extends Component{

    constructor() {
        super();
        this.state={products:[]};
    }

    async componentWillMount() {
        const products=await ProductService.getAllProducts();
        this.setState({products:products})
    }

    render() {
        return (
            <div className="container">
                <div className="row mb-2">
                    {this.state.products.map((product)=>(
                        <div className="col-12 col-sm-6 col-lg-4">
                            <Product key={product.id} product={product}/>
                        </div>
                    ))}
                </div>
            </div>
        )
    }
}

export default Products;