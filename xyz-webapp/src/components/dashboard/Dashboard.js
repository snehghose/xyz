import React, { Component } from 'react';
import Products from './products/Products';

class Dashboard extends Component {
    render() {
        return (
            <>
            <div className="jumbotron jumbotron-fluid">
            </div>
            <Products/>
            </>
        )
    }
}

export default Dashboard;