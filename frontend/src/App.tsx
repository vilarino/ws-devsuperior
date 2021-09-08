import NavBar from "components/NavBar"
import Footer from 'components/Footer'
import DataTable from "components/DataTable";

function App() {
  return (
    <>
      <NavBar />
      <div className="App container">
        <h1 className="text-primary">Olá mundo</h1>
      </div>
      <DataTable />
      <Footer />
    </>
  ); 
}

export default App;
