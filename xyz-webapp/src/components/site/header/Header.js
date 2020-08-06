import React, {Component} from 'react';
import '../../App.css'
import { Link } from 'react-router-dom';

class Header extends Component {
    render() {
        return (
            <nav className="navbar header navbar-light navbar-expand-sm bg-danger">
                <div className="nav-item">
                    <Link className="nav-link text-light" to="/"><h3>Fruit Corner</h3></Link>
                </div>
                <button className="navbar-toggler" data-toggle="collapse" data-target="#navcontent">
                    <span className="navbar-toggler-icon"/>
                </button>
                <div className="collapse navbar-collapse" id="navcontent">
                    <ul className="navbar-nav ml-auto">
                        <li className="nav-item">
                            <Link className="nav-link text-light" to="/">Menu</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link text-light" to="/cart">Cart</Link>
                        </li>
                    </ul>
                </div>
            </nav>
        )
    }
}

export default Header;