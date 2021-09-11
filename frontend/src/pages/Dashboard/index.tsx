import BarChart from "components/BarChart"
import DonutChart from "components/BonutChart"
import DataTable from "components/DataTable"
import Footer from "components/Footer"
import NavBar from "components/NavBar"

const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="App container">
                <h1 className="text-primary py-3">Dashboard Vendas</h1>
                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary ">Taxa de sucesso (%)</h5>
                        <BarChart />
                    </div>

                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary ">Taxa de sucesso (%)</h5>
                        <DonutChart />
                    </div>
                </div>
            </div>
            <div className="py-3">
                <h2 className="text-primary">Todas Vendas </h2>
            </div>
            <DataTable />
            <Footer />
        </>
    )
}

export default Dashboard