import React, { Component }  from 'react';
import './TvmLoginComponent.css';


class TvmInput extends Component{
  constructor(props){
    super(props);
    this.state = {
      inputValue: ''
    };
  }

  _updateInputValue = (event) => {
    this.setState({
      inputValue: event.target.value
    });
  }

  render(){
    return(
      <input value={this.state.inputValue} onChange={event => this._updateInputValue(event)} type={this.props.type || 'text'} className="form-control" name={this.props.name} placeholder={this.props.placeholder} required=""/>
    )
  }
}

class TvmUserTable extends Component{

_deleteTrigger = (index) => {
      this.props.callbackFromParent(index);
}


  render(){
    if(this.props.users.length !== 0){
      return(
      <table className="userTable">
                      <tr>
                        <th>Name</th>
                        <th>Surname</th>
                        <th>Address</th>
                        <th></th>
                      </tr>
              {
                this.props.users.map((user,index) => {
                  return(
                      <tr key={user.id}>
                        <td>{user.name}</td>
                        <td>{user.surname}</td>
                        <td>{user.address}</td>
                        <td><button onClick={this._deleteTrigger.bind(this,index)} className="btn btn-danger">Delete</button></td>
                      </tr>
                  )
                })
              }
        </table>
 
    )
   }else{
     return(
       <div>You should add user!</div>
     )
   }

  }
}


class TvmLoginComponent extends Component{
  constructor(props){
    super(props);
    this.state = {
      color : 'blue',
      users : [],
      user: {},
      userid: 1,
      listDataFromChild: null

    }
  }

  _saveUser = () => {
      let uname = document.getElementsByName("uname")[0].value;
      let usurname = document.getElementsByName("usurname")[0].value;
      let uaddress = document.getElementsByName("uaddress")[0].value;
    
      if(uname === '' || usurname === '' || uaddress === ''){
          alert('Please, fill all blank areas!')
      }
      else{
        let newUser = {
          id: this.state.userid, name: uname, surname: usurname, address: uaddress
        }

        this.setState({users: this.state.users.concat([newUser])});
    
        this.setState((prevState) => ({
              userid: prevState.userid + 1
        }));
      }
    }

    _deleteSelectedUser = (index) => {
      this.setState({
        users: this.state.users.filter(( _ , i) => i !== index)
      })

    }

  render(){
    return(
      <div className="container">
        <div className="row">
          <div className="col-md-6">
            <h3>User Registration</h3>
            <TvmInput placeholder="Name" type="text" name="uname" />
            <div>{this.state.user.name}</div>
            <TvmInput placeholder="Surname" name="usurname" />
            <TvmInput placeholder="Address" name="uaddress" />
            <button onClick={this._saveUser} className="btn btn-primary btn-register">Register</button>
          </div>
          <div className="col-md-6">
            <h3>Users</h3>
            <TvmUserTable users={this.state.users} callbackFromParent={this._deleteSelectedUser} /> 
          </div>
        </div>

      </div>
    )
  }
}

export default TvmLoginComponent;